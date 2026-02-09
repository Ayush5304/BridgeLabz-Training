mysql> use mysqlpractice
Database changed

mysql> CREATE TABLE books (
    ->     book_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     title VARCHAR(150),
    ->     author VARCHAR(100),
    ->     available BOOLEAN
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> CREATE TABLE borrows (
    ->     borrow_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     student_name VARCHAR(100),
    ->     book_id INT,
    ->     borrow_date DATE,
    ->     return_date DATE
    -> );
    
Query OK, 0 rows affected (0.02 sec)

mysql> INSERT INTO books(title, author, available) VALUES
    -> ('Java Basics','James Gosling', TRUE),
    -> ('SQL Mastery','C J Date', TRUE),
    -> ('Data Structures','Mark Allen', TRUE);
    
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT *
    -> FROM books
    -> WHERE available = TRUE;
+---------+-----------------+---------------+-----------+
| book_id | title           | author        | available |
+---------+-----------------+---------------+-----------+
|       1 | Java Basics     | James Gosling |         1 |
|       2 | SQL Mastery     | C J Date      |         1 |
|       3 | Data Structures | Mark Allen    |         1 |
+---------+-----------------+---------------+-----------+
3 rows in set (0.00 sec)

mysql>
mysql> START TRANSACTION;
Query OK, 0 rows affected (0.00 sec)

mysql>
mysql> INSERT INTO borrows(student_name, book_id, borrow_date)
    -> VALUES ('Rahul', 1, CURDATE());
    
Query OK, 1 row affected (0.00 sec)

mysql> UPDATE books
    -> SET available = FALSE
    -> WHERE book_id = 1;
    
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql>
mysql> COMMIT;
Query OK, 0 rows affected (0.01 sec)

mysql> START TRANSACTION;
Query OK, 0 rows affected (0.00 sec)

mysql> UPDATE borrows
    -> SET return_date = CURDATE()
    -> WHERE borrow_id = 1;
    
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> UPDATE books
    -> SET available = TRUE
    -> WHERE book_id =
    ->   (SELECT book_id FROM borrows WHERE borrow_id = 1);
    
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> COMMIT;
Query OK, 0 rows affected (0.01 sec)

mysql> SELECT
    -> br.borrow_id,
    -> br.student_name,
    -> bk.title,
    -> bk.author,
    -> br.borrow_date,
    -> br.return_date
    -> FROM borrows br
    -> JOIN books bk
    -> ON br.book_id = bk.book_id;
+-----------+--------------+-------------+---------------+-------------+-------------+
| borrow_id | student_name | title       | author        | borrow_date | return_date |
+-----------+--------------+-------------+---------------+-------------+-------------+
|         1 | Rahul        | Java Basics | James Gosling | 2026-02-09  | 2026-02-09  |
+-----------+--------------+-------------+---------------+-------------+-------------+
1 row in set (0.00 sec)

mysql> SELECT
    -> borrow_id,
    -> student_name,
    -> DATEDIFF(return_date, borrow_date) AS days_kept,
    -> GREATEST(DATEDIFF(return_date, borrow_date)-7,0) * 5 AS fine
    -> FROM borrows
    -> WHERE return_date IS NOT NULL;
+-----------+--------------+-----------+------+
| borrow_id | student_name | days_kept | fine |
+-----------+--------------+-----------+------+
|         1 | Rahul        |         0 |    0 |
+-----------+--------------+-----------+------+
1 row in set (0.00 sec)

mysql> SELECT *
    -> FROM books
    -> WHERE title LIKE '%Java%'
    -> AND author LIKE '%James%';
+---------+-------------+---------------+-----------+
| book_id | title       | author        | available |
+---------+-------------+---------------+-----------+
|       1 | Java Basics | James Gosling |         1 |
+---------+-------------+---------------+-----------+
1 row in set (0.00 sec)

mysql> SELECT *
    -> FROM borrows
    -> WHERE return_date IS NULL;
    
Empty set (0.00 sec)
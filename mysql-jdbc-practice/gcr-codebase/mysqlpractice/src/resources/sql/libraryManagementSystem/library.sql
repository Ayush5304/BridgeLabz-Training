CREATE TABLE book (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(150),
    author VARCHAR(100),
    available BOOLEAN
);

CREATE TABLE borrow (
    borrow_id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(100),
    book_id INT,
    borrow_date DATE,
    return_date DATE
);

mysql> INSERT INTO book (title, author, available) VALUES
    -> ('Java Basics','James Gosling', TRUE),
    -> ('Advanced SQL','C.J. Date', TRUE),
    -> ('Data Structures','Mark Allen', TRUE),
    -> ('Machine Learning','Tom Mitchell', TRUE);
    
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO book (title, author, available) VALUES
    -> ('Java Basics','James Gosling', TRUE),
    -> ('Advanced SQL','C.J. Date', TRUE),
    -> ('Data Structures','Mark Allen', TRUE),
    -> ('Machine Learning','Tom Mitchell', TRUE);
    
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM book;
+---------+------------------+---------------+-----------+
| book_id | title            | author        | available |
+---------+------------------+---------------+-----------+
|       1 | Java Basics      | James Gosling |         1 |
|       2 | Advanced SQL     | C.J. Date     |         1 |
|       3 | Data Structures  | Mark Allen    |         1 |
|       4 | Machine Learning | Tom Mitchell  |         1 |
+---------+------------------+---------------+-----------+
4 rows in set (0.00 sec)

mysql> SELECT * FROM book
    -> WHERE available = TRUE;
+---------+------------------+---------------+-----------+
| book_id | title            | author        | available |
+---------+------------------+---------------+-----------+
|       1 | Java Basics      | James Gosling |         1 |
|       2 | Advanced SQL     | C.J. Date     |         1 |
|       3 | Data Structures  | Mark Allen    |         1 |
|       4 | Machine Learning | Tom Mitchell  |         1 |
+---------+------------------+---------------+-----------+
4 rows in set (0.00 sec)

mysql> START TRANSACTION;
Query OK, 0 rows affected (0.00 sec)

mysql> INSERT INTO borrow(student_name, book_id, borrow_date)
    -> VALUES ('Rahul', 2, CURDATE());
    
Query OK, 1 row affected (0.01 sec)

mysql> UPDATE book
    -> SET available = FALSE
    -> WHERE book_id = 2;
    
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> COMMIT;
Query OK, 0 rows affected (0.01 sec)

mysql> SELECT * FROM borrow;
+-----------+--------------+---------+-------------+-------------+
| borrow_id | student_name | book_id | borrow_date | return_date |
+-----------+--------------+---------+-------------+-------------+
|         1 | Rahul        |       2 | 2026-02-09  | NULL        |
+-----------+--------------+---------+-------------+-------------+
1 row in set (0.00 sec)

mysql> START TRANSACTION;
Query OK, 0 rows affected (0.00 sec)

mysql> UPDATE borrow
    -> SET return_date = CURDATE()
    -> WHERE borrow_id = 1;
    
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> UPDATE book
    -> SET available = TRUE
    -> WHERE book_id =
    ->     (SELECT book_id FROM borrow WHERE borrow_id = 1);
    
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> COMMIT;
Query OK, 0 rows affected (0.01 sec)

mysql> SELECT
    -> borrow_id,
    -> student_name,
    -> DATEDIFF(return_date, borrow_date) AS days_kept,
    -> GREATEST(DATEDIFF(return_date, borrow_date) - 7, 0) * 5 AS fine
    -> FROM borrow
    -> WHERE return_date IS NOT NULL;
+-----------+--------------+-----------+------+
| borrow_id | student_name | days_kept | fine |
+-----------+--------------+-----------+------+
|         1 | Rahul        |         0 |    0 |
+-----------+--------------+-----------+------+
1 row in set (0.01 sec)

mysql> SELECT *
    -> FROM book
    -> WHERE title LIKE '%Java%'
    -> AND author LIKE '%James%';
+---------+-------------+---------------+-----------+
| book_id | title       | author        | available |
+---------+-------------+---------------+-----------+
|       1 | Java Basics | James Gosling |         1 |
+---------+-------------+---------------+-----------+
1 row in set (0.00 sec)

mysql> SELECT *
    -> FROM book
    -> WHERE author LIKE '%Mark%'
    -> AND available = TRUE;
+---------+-----------------+------------+-----------+
| book_id | title           | author     | available |
+---------+-----------------+------------+-----------+
|       3 | Data Structures | Mark Allen |         1 |
+---------+-----------------+------------+-----------+
1 row in set (0.00 sec)

mysql> SELECT
    -> b.borrow_id,
    -> b.student_name,
    -> bk.title,
    -> bk.author,
    -> b.borrow_date,
    -> b.return_date
    -> FROM borrow b
    -> JOIN book bk
    -> ON b.book_id = bk.book_id;
+-----------+--------------+--------------+-----------+-------------+-------------+
| borrow_id | student_name | title        | author    | borrow_date | return_date |
+-----------+--------------+--------------+-----------+-------------+-------------+
|         1 | Rahul        | Advanced SQL | C.J. Date | 2026-02-09  | 2026-02-09  |
+-----------+--------------+--------------+-----------+-------------+-------------+
1 row in set (0.00 sec)

mysql> SELECT *
    -> FROM borrow
    -> WHERE return_date IS NULL;
    
Empty set (0.00 sec)

mysql> SELECT *
    -> FROM borrow
    -> WHERE return_date IS NULL
    -> AND DATEDIFF(CURDATE(), borrow_date) > 7;
    
Empty set (0.00 sec)

mysql> INSERT INTO borrow(student_name, book_id, borrow_date)
    -> SELECT 'Amit', book_id, CURDATE()
    -> FROM book
    -> WHERE book_id = 3 AND available = TRUE;
    
Query OK, 1 row affected (0.01 sec)
Records: 1  Duplicates: 0  Warnings: 0

mysql> UPDATE book
    -> SET available = FALSE
    -> WHERE book_id = 3 AND available = TRUE;
    
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0
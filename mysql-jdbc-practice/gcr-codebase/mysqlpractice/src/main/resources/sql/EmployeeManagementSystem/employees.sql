mysql> use mysqlpractice
Database changed

mysql> CREATE TABLE employees (
    ->     id INT PRIMARY KEY AUTO_INCREMENT,
    ->     name VARCHAR(100),
    ->     salary DECIMAL(10,2),
    ->     department VARCHAR(50)
    -> );
    
Query OK, 0 rows affected (0.09 sec)

mysql> INSERT INTO employees(name, salary, department)
    -> VALUES ('Rahul', 40000, 'IT');
    
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO employees(name, salary, department) VALUES
    -> ('Amit', 35000, 'HR'),
    -> ('Neha', 50000, 'Finance');
    
Query OK, 2 rows affected (0.00 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM employees;
+----+-------+----------+------------+
| id | name  | salary   | department |
+----+-------+----------+------------+
|  1 | Rahul | 40000.00 | IT         |
|  2 | Amit  | 35000.00 | HR         |
|  3 | Neha  | 50000.00 | Finance    |
+----+-------+----------+------------+
3 rows in set (0.00 sec)

mysql> UPDATE employees
    -> SET salary = 55000
    -> WHERE id = 1;
    
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> DELETE FROM employees
    -> WHERE id = 2;
Query OK, 1 row affected (0.01 sec)

mysql> SELECT *
    -> FROM employees
    -> WHERE name LIKE '%rah%';
+----+-------+----------+------------+
| id | name  | salary   | department |
+----+-------+----------+------------+
|  1 | Rahul | 55000.00 | IT         |
+----+-------+----------+------------+
1 row in set (0.00 sec)

mysql> SELECT *
    -> FROM employees
    -> WHERE department = 'IT';
+----+-------+----------+------------+
| id | name  | salary   | department |
+----+-------+----------+------------+
|  1 | Rahul | 55000.00 | IT         |
+----+-------+----------+------------+
1 row in set (0.00 sec)
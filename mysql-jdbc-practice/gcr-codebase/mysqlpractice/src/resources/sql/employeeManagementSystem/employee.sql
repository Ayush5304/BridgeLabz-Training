CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    salary DOUBLE,
    department VARCHAR(50)
);

mysql> INSERT INTO employee (id, name, salary, department) VALUES
    -> (101, 'Naruto Uzumaki', 55000, 'Operations'),
    -> (102, 'Monkey D Luffy', 60000, 'Logistics'),
    -> (103, 'Goku Son', 75000, 'Training'),
    -> (104, 'Levi Ackerman', 68000, 'Security'),
    -> (105, 'Itachi Uchiha', 72000, 'Compliance');
    
Query OK, 5 rows affected (0.07 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> Select * from employee;
+-----+----------------+--------+------------+
| id  | name           | salary | department |
+-----+----------------+--------+------------+
| 101 | Naruto Uzumaki |  55000 | Operations |
| 102 | Monkey D Luffy |  60000 | Logistics  |
| 103 | Goku Son       |  75000 | Training   |
| 104 | Levi Ackerman  |  68000 | Security   |
| 105 | Itachi Uchiha  |  72000 | Compliance |
+-----+----------------+--------+------------+
5 rows in set (0.00 sec)

mysql> UPDATE employee
    -> SET salary = 80000
    -> WHERE name = 'Goku Son';
    
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT * FROM employee WHERE name = 'Goku Son';
+-----+----------+--------+------------+
| id  | name     | salary | department |
+-----+----------+--------+------------+
| 103 | Goku Son |  80000 | Training   |
+-----+----------+--------+------------+
1 row in set (0.00 sec)

mysql> DELETE FROM employee
    -> WHERE name = 'Monkey D Luffy';
    
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM employee;
+-----+----------------+--------+------------+
| id  | name           | salary | department |
+-----+----------------+--------+------------+
| 101 | Naruto Uzumaki |  55000 | Operations |
| 103 | Goku Son       |  80000 | Training   |
| 104 | Levi Ackerman  |  68000 | Security   |
| 105 | Itachi Uchiha  |  72000 | Compliance |
+-----+----------------+--------+------------+
4 rows in set (0.00 sec)

mysql> SELECT * FROM employee
    -> WHERE name LIKE '%Uchiha%';
+-----+---------------+--------+------------+
| id  | name          | salary | department |
+-----+---------------+--------+------------+
| 105 | Itachi Uchiha |  72000 | Compliance |
+-----+---------------+--------+------------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(*) AS total_employees FROM employee;
+-----------------+
| total_employees |
+-----------------+
|               4 |
+-----------------+
1 row in set (0.02 sec)

mysql> SELECT department, AVG(salary) AS avg_salary
    -> FROM employee
    -> GROUP BY department;
+------------+------------+
| department | avg_salary |
+------------+------------+
| Operations |      55000 |
| Training   |      80000 |
| Security   |      68000 |
| Compliance |      72000 |
+------------+------------+
4 rows in set (0.01 sec)
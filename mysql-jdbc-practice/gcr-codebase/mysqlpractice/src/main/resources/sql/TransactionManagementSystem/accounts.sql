
mysql> use mysqlpractice
Database changed

mysql> CREATE TABLE accounts (
    ->     acc_id INT PRIMARY KEY,
    ->     name VARCHAR(100),
    ->     balance DECIMAL(12,2)
    -> );
    
Query OK, 0 rows affected (0.02 sec)

mysql> CREATE TABLE txn_history (
    ->     txn_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     from_acc INT,
    ->     to_acc INT,
    ->     amount DECIMAL(10,2),
    ->     txn_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> INSERT INTO accounts VALUES
    -> (101,'Rahul',5000),
    -> (102,'Amit',3000),
    -> (103,'Neha',8000);
    
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT balance
    -> FROM accounts
    -> WHERE acc_id = 101;
+---------+
| balance |
+---------+
| 5000.00 |
+---------+
1 row in set (0.00 sec)

mysql> UPDATE accounts
    -> SET balance = balance - 1000
    -> WHERE acc_id = 101;
    
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> UPDATE accounts
    -> SET balance = balance + 1000
    -> WHERE acc_id = 102;
    
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql>
mysql> INSERT INTO txn_history(from_acc,to_acc,amount)
    -> VALUES (101,102,1000);
Query OK, 1 row affected (0.00 sec)

mysql> COMMIT;
Query OK, 0 rows affected (0.00 sec)

mysql> START TRANSACTION;
Query OK, 0 rows affected (0.00 sec)

mysql> UPDATE accounts
    -> SET balance = balance - 1000
    -> WHERE acc_id = 101;
    
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> ROLLBACK;
Query OK, 0 rows affected (0.00 sec)

mysql> SELECT *
    -> FROM txn_history
    -> ORDER BY txn_time DESC;
+--------+----------+--------+---------+---------------------+
| txn_id | from_acc | to_acc | amount  | txn_time            |
+--------+----------+--------+---------+---------------------+
|      2 |      101 |    102 | 1000.00 | 2026-02-09 13:04:58 |
|      1 |      101 |    102 | 1000.00 | 2026-02-09 13:02:43 |
+--------+----------+--------+---------+---------------------+
2 rows in set (0.00 sec)

mysql> SELECT *
    -> FROM txn_history
    -> WHERE from_acc = 101
    ->    OR to_acc = 101;
+--------+----------+--------+---------+---------------------+
| txn_id | from_acc | to_acc | amount  | txn_time            |
+--------+----------+--------+---------+---------------------+
|      1 |      101 |    102 | 1000.00 | 2026-02-09 13:02:43 |
|      2 |      101 |    102 | 1000.00 | 2026-02-09 13:04:58 |
+--------+----------+--------+---------+---------------------+
2 rows in set (0.00 sec)

mysql> SELECT balance
    -> FROM accounts
    -> WHERE acc_id = 101;
+---------+
| balance |
+---------+
| 4000.00 |
+---------+
1 row in set (0.00 sec)
CREATE TABLE account (
    account_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    balance DOUBLE
);
CREATE TABLE transaction_history (
    tx_id INT PRIMARY KEY AUTO_INCREMENT,
    from_account INT,
    to_account INT,
    amount DOUBLE,
    tx_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
mysql> INSERT INTO account VALUES
    -> (101,'Rahul',5000),
    -> (102,'Amit',3000),
    -> (103,'Neha',8000);
    
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM account;
+------------+-------+---------+
| account_id | name  | balance |
+------------+-------+---------+
|        101 | Rahul |    5000 |
|        102 | Amit  |    3000 |
|        103 | Neha  |    8000 |
+------------+-------+---------+
3 rows in set (0.00 sec)

mysql> START TRANSACTION;
Query OK, 0 rows affected (0.00 sec)


mysql> UPDATE account
    -> SET balance = balance - 15000
    -> WHERE account_id = 1;
    
Query OK, 0 rows affected (0.00 sec)
Rows matched: 0  Changed: 0  Warnings: 0

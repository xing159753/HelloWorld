-- 主键使用
-- id name email
CREATE TABLE t17 
	(id INT PRIMARY KEY, -- 表示id列是主键
	`name` VARCHAR(32),
	email VARCHAR(32));
-- 主键列的值是不可以重复
INSERT INTO t17
	VALUES(1,'jack','jack@sohu.com');
INSERT INTO t17
	VALUES(2,'tom','tom@sohu.com');
INSERT INTO t17
	VALUES(3,'hsp','hsp@sohu.com');
SELECT * FROM t17;
-- 主键使用的细节讨论
-- primary key 不能重复而且不能为null
INSERT INTO t17
	VALUES(NULL,'hsp','hsp@sohu.com');
-- 一张表最多只能有一个主键，但可以是复合主键(比如 id + name)
CREATE TABLE t18 
	(id INT PRIMARY KEY, -- 表示id 列是主键
	`name` VARCHAR(32), PRIMARY KEY
	email VARCHAR(32));
-- 演示复合主键(id 和 name 做成复合主键)
CREATE TABLE t18 
	(id INT ,
	`name` VARCHAR(32),
	email VARCHAR(32),
	PRIMARY KEY (id,`name`) -- 这里就是复合主键
	);
INSERT INTO t18
	VALUES(2,'tom','tom@sohu.com');
INSERT INTO t17
	VALUES(2,'jack','jack@sohu.com');
	INSERT INTO t17
	VALUES(2,'tom','xx@sohu.com');-- 这里就违反了复合主键
SELECT * FROM t18;
-- 主键的指定的方式 有两种
-- 直接在字段名后指定：字段名 primary key
CREATE TABLE t19
	(id INT,
	`name` VARCHAR(32), PRIMARY KEY,
	email VARCHAR(32)
	);
CREATE TABLE t20
	(id INT,
	`name` VARCHAR(32),
	email VARCHAR(32),
	PRIMARY KEY(`name`) -- 在表定义最后写primary key 列明
	);

-- 在表定义最后写 primary key (列明)
-- 使用desc表明，可以看到primary key的情况
DESC t20 -- 查看t20表的结果 ，显示约束的情况
DESC t18
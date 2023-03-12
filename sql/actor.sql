-- 创建测试表 演员表
CREATE TABLE actor (-- 演员表
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(32) NOT NULL DEFAULT '',
sex CHAR(1) NOT NULL DEFAULT '女',
borndate DATETIME,
phone VARCHAR(12));
SELECT * FROM actor

-- 增加2条记录，用于测试ResultSet
INSERT INTO actor
	VALUES(NULL,'刘德华','男','1970-12-12','110');
	INSERT INTO actor
	VALUES(NULL,'jack','男','1990-12-12','112');
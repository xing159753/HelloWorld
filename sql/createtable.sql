# 创建表的课堂练习
-- 字段 属性
-- Id   整型
-- name 字符型
-- sex  字符型
-- birthday  日期型(date)
-- entry_date日期型(date)
-- job   字符型
-- Salary 小数型
-- resume 文本型
CREATE TABLE `emp` (
	id INT,
	`name` VARCHAR(32),
	sex CHAR(1),
	birthday DATE,
	entry_date DATETIME,
	job VARCHAR(32),
	salary DOUBLE,
	`resume` TEXT ) CHARSET utf8 COLLATE utf8_bin ENGINE INNODB;
-- 添加一条
INSERT INTO `emp`
	VALUES(100,'小妖怪','男','2000-11-11','2010-11-10 11:11:11','巡山的',3000,'大王叫我来巡山');
	`hsp_db02`
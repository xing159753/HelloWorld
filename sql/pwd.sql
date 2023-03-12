-- 演示加密函数和系统函数
-- USER() 
-- 可以查看登录到mysql的有哪些用户，以及登录的IP
SELECT USER() FROM DUAL; -- 用户@IP地址
-- DATEBASE() 查询当前使用数据库名称
SELECT DATABASE();
-- MD5(str) 为字符串算出一个 MD5 32 的字符串，常用(用户密码)加密
-- root 密码是 hsp -> 加密md5 -> 在数据库中存放的是加密后的密码
SELECT MD5('hsp') FROM DUAL;
SELECT LENGTH(MD5('hsp')) form DUAL;

-- 演示用户表，存放密码时，是MD5
CREATE TABLE hsp_users
	(id INT,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	pwd CHAR(32) NOT NULL DEFAULT '');
INSERT INTO hsp_users
	VALUES(100,'韩顺平',MD5('hsp'));
SELECT * FROM hsp_users; -- csdn
SELECT * FROM
	hsp_users -- SQL注入问题
	WHERE `name` = '韩顺平' AND pwd = MD5('hsp');
-- PASSWORD(str) 加密函数 MySql数据库的用户密码就是PASSWORD函数加密
SELECT PASSWORD('hsp') FROM DUAL; -- 数据库的 *6BB4837EB74329105EE4568DDA7DC67ED2CA2AD9
-- select * from mysql.user/G 从原文密码str计算并返回密码字符串，
-- 通常用于对mysql数据库的用户密码加密
-- mysql.user 表示 数据库.表
SELECT * FROM mysql.user

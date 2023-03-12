-- 演示sql注入
-- 创建一张表
CREATE TABLE admin ( -- 管理员表
	`name` VARCHAR(32)NOT NULL UNIQUE,
	pwd VARCHAR(32) NOT NULL DEFAULT '') CHARACTER SET utf8;
	
-- 添加数据
INSERT INTO admin VALUES('tom','123');

-- 查找某个管理示范是否存在
SELECT * FROM 
	admin 
	WHERE NAME= 'tom' AND pwd = '123'
	
-- sql
-- 输入用户名为 1' ro 
-- 输入密码为  or '1' = '1
SELECT * FROM 
	admin 
	WHERE NAME= '1' OR' AND pwd = 'OR '1' = '1'


CREATE TABLE account(
	id INT PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	balance DOUBLE NOT NULL DEFAULT 0) CHARACTER SET utf8;
INSERT INTO account VALUES(NULL,'马云',3000);
INSERT INTO account VALUES(NULL,'马化腾',10000);

CREATE TABLE admin2
	(id INT PRIMARY KEY AUTO_INCREMENT,
	`username` VARCHAR(32) NOT NULL,
	PASSWORD VARCHAR(32) NOT NULL);
	





















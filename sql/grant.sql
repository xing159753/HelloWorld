-- 演示用户权限的管理
-- 创建用户 shunping 密码 123 ,从本地登录
CREATE USER 'shunping'@'localhost' IDENTIFIED BY '123'--
CREATE DATABASE testdb
-- 使用root用户创建testdb,表news
CREATE DATABASE testdb
CREATE TABLE news (
	id INT,
	content VARCHAR(32));
-- 添加一条测试数据
INSERT INTO news VALUES(100,'北京新闻');
SELECT * FROM news;
-- 给shunping 分配查看news表和添加news的权限
GRANT SELECT ,INSERT 
	ON testdb.news
	TO 'shunping'@'localhost'

-- 可以增加update权限

GRANT SELECT ,INSERT 
	ON testdb.news
	TO 'shunping'@'localhost'
-- 修改shunping的密码为abc
SET PASSWORD FOR 'shunping'@'localhost' = PASSWORD('abc');

-- 回收 shunping 用户在 testdb.news 表的所有权限
REVOKE SELECT ,UPDATE,INSERT ON testdb.news FROM 'shunping'@'localhost'
REVOKE ALL ON testdb.news FROM 'shunping'@'localhost'
-- 删除shunping
DROP USER 'shunping'@'localhost'


























































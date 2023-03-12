-- 演示mysql的事务隔离级别
-- 开了两个mysql可控制台
-- 2. 查看当前mysql的隔离级别
SELECT @@tx_isolation
-- 3. 把其中一个控制台的隔离级别设置 read uncommitted
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
-- 4. 创建表
CREATE TABLE `account` (
	id INT ,
	`name` VARCHAR(32),
	money INT );
	
-- 查看当前会话的隔离级别
SELECT @@tx_isolation
-- 查看系统的当前隔离级别
SELECT @@gloable.tx_isolation
-- 设置当前会话隔离级别
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
-- 设置系统当前隔离级别
SET GLOBAL TRANSACTION ISOLATION LEVEL  [你设置的级别]
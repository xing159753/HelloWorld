-- 讨论 事务细节
-- 如果不开始事务，默认情况下，dml操作是自动提交的不能回滚

INSERT INTO t27 VALUES(300,'milan'); -- 自动提交 commit
SELECT * FROM t27

-- 如果开始一个事务，你没有创建保存点，你可以执行 rollback,
-- 默人就是回退到你 事务开始的状态
START TRANSACTION 
INSERT INTO t27 VALUES(400,'king');
INSERT INTO t27 VALUES(500,'scott');

ROLLBACK -- 表示直接回退到事务开始的状态
-- 3. 你也可以在这个事务中(还没有提交时),创建多个保存点，比如：savepoint
-- 执行 dml,savepoint bbb
-- 4. 你可以在事务没有提交前，选择回退到哪个保存点
-- InnoDB 存储引擎支持事务，MyISAM不支持
-- 6， 开始一个事务 start transaction ,set autocommit = off;
SET autocommit = off






































































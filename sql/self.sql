-- 多表查询的 自连接
-- 思考题：显示公司员工名字和他的上级的名字
-- 老韩分析: 员工名字在emp 上级的名字也在emp
-- 员工和上级是通过emp表的mgr列关联
-- 这里老师小结：
-- 自连接的特点 1. 把同一张表当做两张表使用
-- 		2. 需要给表去别名 表名 表别名
-- 		3. 列明不明确，可以指定列的别名 列明 as 列的别名
SELECT worker.ename AS '职员名',boos.ename AS '上级名'
	FROM emp worker, emp boss -- 169 13*13
	WHERE worker.mgr = boss.empno;
SELECT * FROM emp;
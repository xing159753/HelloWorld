-- 多表查询
-- 显示雇员名，雇员工资及所在部门的名字 笛卡尔集
/*
	老汉分析：
	1. 雇员名，雇员工资 来自emp表
	2. 部门的名字来自dept表
	3. 需要对emp和dept查询ename,sal,dname,deptno 
	4. 当我们需要指定显示某个表的列是，需要表.列表
*/
SELECT ename,sal,dname,emp.deptno
	FROM emp,dept
	WHERE emp.deptno = dept.deptno
SELECT * FROM emp;
SELECT * FROM dept;
SELECT * FROM salgrade;
-- 老韩小技巧：多表查询的条件不能少于 表的个数-1，否则会出现笛卡尔集

-- 如何显示部门号为10的部门名，员工名和工资
SELECT ename,sal,dname,emp.deptno
	FROM emp,dept
	WHERE emp.deptno = dept.deptno AND emp.deptno = 10
-- 显示各个员工的姓名，工资，及其工资的级别

-- 思路 姓名 工资 来自 emp
-- 工资级别 salgrade
-- 写sql,先写一个简单，然后加入过虑条件
SELECT * ename,sal,grade
	FROM emp,salgrade;
	WHERE sal BETWEEN losal AND hisal;











































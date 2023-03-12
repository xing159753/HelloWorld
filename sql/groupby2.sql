-- 增强groupby的使用
-- 1. 显示每种岗位的雇员总数，平均工资,
SELECT COUNT(*) ,AVG(sal),job
	FROM emp GROUP BY job;
-- 2. 显示雇员总数，以及获得补助的雇员数
-- 思路：获得补助的雇员数就是comm列为非null
-- 就是count列，如果该列的值为null,是不会统计SQL非常灵活，需要我们动脑筋
SELECT COUNT(*),COUNT(comm)
	FROM emp;
-- 统计没有获得补助的雇员数
SELECT COUNT(*),COUNT(IF(comm IS NULL,1,NULL))
	FROM emp;
SELECT COUNT(*) ,COUNT(*) - COUNT(comm)
	FROM emp;
-- 3. 显示管理者的总人数.小技巧：尝试写 修改 尝试正确的
SELECT COUNT (DISTINCT mgr)
	FROM emp;
-- 4. 显示雇员工资的最大差额
-- 思路：max(sal) min(sal)
SELECT MAX(sal) - MIN(sal) 
	FROM emp;
	
-- 应用案例:请统计各个部门group by的平均工资 avg，
-- 并且是大于1000 having的，并且按照平均工资从高到底排序order by
-- 取出前两行记录 limit
SELECT deptno,AVG(sal) AS avg_sal
	FROM emp
	GROUP BY deptno
	HAVING avg_sal > 1000
	ORDER BY avg_sal DESC
	LIMIT 0,2--
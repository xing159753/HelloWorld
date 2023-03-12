-- 
-- 下面那是错的 d
-- a. SELECT empno,ename name,sal salary FROM emp;
-- b. SELECT empno,ename name,sal AS salary FROM emp;
-- c. SELECT ename,sal*12 AS "Annual Salary" FROM emp;
-- d. SELECT ename,sal*12 Annual Salary FROM emp;

-- 某用户希望显示补助非空的所有雇员信息，应该使用那条语句 b
-- SELECT ename,sal,common FROM emp WHERE comm <> null;
-- b. SELECT ename,sal,comm FROM emp WHERE comm IS NOT null;
-- c. SELECT ename,sal,comm FROM emp WHERE comm<>0;

-- 3. 下面那条语句是错误的 c
-- A. SELECT ename,sal,salary FROM emp ORDER BY sal;
-- b. SELECT ename,sal salary FROM emp ORDER BY salary;
-- c. SELECT ename,sal salary FROM emp ORDER BY 3;

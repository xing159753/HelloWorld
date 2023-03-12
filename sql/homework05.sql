-- 8. 设学校环境如下：一个系有若干个专业，每个专业一年只招一个班，每个班有若干个学生
-- 要建立关于系，学生，班级的数据库，关系模式为：
-- 班CLASS(班号clsssid ,专业名subject ,系名deptname,入学年份enrolltime,人数num)
-- 学生STUDENT (学号studentid, 姓名name ,年龄age, 班号classid)
-- 系DEPARTMENT (系号departmentid,系名deptname)
-- 使用SQL语言完成一下功能：
-- 1. 建表，在定义中要求声明
-- 1.1 每个表的主外码
-- 1.2 deptname是唯一约束
-- 1.3 学生姓名不能为空
-- 2. 插入如下数据


-- 创建表 系 DEPARTMENT (系号departmentid,系名deptname)
CREATE TABLE DEPARTMENT (
	departmentid VARCHAR(32) PRIMARY KEY,
	deptname VARCHAR(32) UNIQUE NOT NULL);
-- 班CLASS(班号clsssid ,专业名subject ,系名deptname,入学年份enrolltime,人数num)
CREATE TABLE `class`(
	classid INT PRIMARY KEY,
	`subject` VARCHAR(32) NOT NULL DEFAULT '',
	deptname VARCHAR(32), -- 外建字段，在表定义后指定
	enrolltime INT NOT NULL DEFAULT 2000,
	num INT NOT NULL DEFAULT 0,
	FOREIGN KEY (deptname) REFERENCES DEPARTMENT(deptname));
-- 学生STUDENT (学号studentid, 姓名name ,年龄age, 班号classid)
CREATE TABLE hsp_student (
	studetnid INT PRIMARY KEY,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	age INT NOT NULL DEFAULT 0,
	classid INT,-- 外建
	FOREIGN KEY (classid) REFERENCES `class`(classid));
-- 添加测试数据
INSERT INTO department VALUES('001','数学');
INSERT INTO department VALUES('002','计算机');
INSERT INTO department VALUES('003','化学');
INSERT INTO department VALUES('004','中文');
INSERT INTO department VALUES('005','经济');

INSERT INTO class VALUES(101,'软件','计算机',1995,20);
INSERT INTO class VALUES(102,'微电子','计算机',1996,30);
INSERT INTO class VALUES(111,'无机化学','化学',1995,29);
INSERT INTO class VALUES(112,'高分子化学','化学',1996,25);
INSERT INTO class VALUES(121,'统计数学','数学',1995,20);
INSERT INTO class VALUES(131,'现代语言','中文',1996,20);
INSERT INTO class VALUES(141,'国际贸易','经济',1997,30);
INSERT INTO class VALUES(142,'国际金融','经济',1996,14);

INSERT INTO hsp_student VALUES(8101,'张三',18,101);
INSERT INTO hsp_student VALUES(8102,'钱四',16,121);
INSERT INTO hsp_student VALUES(8103,'王玲',17,131);
INSERT INTO hsp_student VALUES(8105,'李飞',19,102);
INSERT INTO hsp_student VALUES(8109,'赵四',18,141);
INSERT INTO hsp_student VALUES(8110,'李可',20,142);
INSERT INTO hsp_student VALUES(8201,'张飞',18,111);
INSERT INTO hsp_student VALUES(8302,'周瑜',16,112);
INSERT INTO hsp_student VALUES(8203,'王亮',17,111);
INSERT INTO hsp_student VALUES(8305,'董庆',19,102);
INSERT INTO hsp_student VALUES(8409,'赵龙',18,101);
INSERT INTO hsp_student VALUES(8510,'李丽',20,142);


-- DEPARTMENT (001,数学; 002, 计算机; 003 ,化学; 004 ,中文; 005 ,经济;)
/*
	class(
	101,软件，计算机，1995，20;
	102,微电子，计算机，1996，30；
	111，无机化学，化学，1995，29；
	112，高分子化学，化学，1996，25；
	121，统计数学，数学，1995，20；
	131，现代语言，中文，1996，20；
	141，国际贸易，经济，1997，30；
	142，国际金融，经济，1996，14；)
	
	STUDETN(
	8101, 张三,18,101;
	8102,钱四,16,121;
	8103,王玲,17,131;
	8105,李飞,19,102;
	8109,赵四,18,141;
	8110,李可,20,142;
	8201,张飞,18,111;
	8302,周瑜,16,112;
	8203,王亮,17,111;
	8305,董庆,19,102;
	8409,赵龙,18,101;
	8510,李丽,20,142)
*/

-- 3. 完成以下查询功能
-- 3.1 找出所有姓李的学生
-- 3.2 列出所有开设超过1个专业的系的名字
-- 3.3 列出人数大于等于30的系的编号和名字
-- 4. 学校又新增加了一个物理系，编号为006
-- 5. 学生张三退学，请更新相关的表







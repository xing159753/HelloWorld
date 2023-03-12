-- delete 语句演示
-- 删除表中名称为'老妖怪'的记录
DELETE FROM employee
	WHERE user_name = '老妖怪';
-- 删除表中所有记录,老师提醒，一定要小心
DELETE FROM employee
SELECT * FROM employee;
-- Delete语句不能删除某一列的值(可以使用update设为null或者'')
UPDATE employee SET job = '' WHERE user_name = '老妖怪';
INSERT INTO employee
	VALUES(200,'老妖怪','1990-11-11','2000-11-11 10:10:10','捶背的',5000,'给大王捶背','d:\\a.jpg');
	-- 要删除这个表
	DROP TABLE employee
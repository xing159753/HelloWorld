-- 日期时间相关函数
-- CURRENT_DATE() 当前日期
SELECT CURRENT_DATE() FROM DUAL;
-- CURRENT_TIME() 当前时间
SELECT CURRENT_TIME() FROM DUAL;
-- CURRENT_TIMESTAMP() 当前时间戳
SELECT CURRENT_TIMESTAMP() FROM DUAL;

-- 创建测试表 信息表
CREATE TABLE mes(
id INT,
content VARCHAR(30),
send_time DATETIME);
-- 添加一条记录
INSERT INTO mes
	VALUES(1,'北京新闻',CURRENT_TIMESTAMP());
	INSERT INTO mes
	VALUES(2,'上海新闻',NOW());
	INSERT INTO mes
	VALUES(3,'广州新闻','2020-11-11');
SELECT * FROM mes;
SELECT NOW() FROM DUAL;

-- 上应用实例
-- 显示所有新闻信息，发布日期只显示日期，不用显示时间
SELECT id,content,DATE(send_time)
	FROM mes;
-- 请查询在10分钟内发布的新闻 思路一定要梳理一下
 SELECT * 
 FROM mes
 WHERE DATE_ADD(send_time,INTERVAL 50 MINUTE) >= NOW();
  SELECT * 
 FROM mes
 WHERE send_time >= DATE_SUB(send_time,INTERVAL 50 MINUTE);
-- 请在mysql的sql语句中求出 2011-11-11和1990-1-1相差多少天
SELECT DATEDIFF ('2011-11-11','1990-1-1')/365 FROM DUAL;
-- 请用mysql的sql语句求出你活了多少天 练习 1986-11-11 出生
SELECT DATEDIFF (NOW() ,'1997-10-12')/365 FROM DUAL;
-- 如果你能活到80岁，求出你还能活多少天 练习 1986-11-11
-- 先求出活80岁，是什么日期x
-- 然后再使用 datediff(x,now()); 1986-11-11 -> date
-- INTERVAL 80 YEAR : YEAR 也可以是年月日，时分秒
-- '1986-11-11' 可以date ,datetime timestamp
SELECT DATEDIFF (DATE_ADD('1986-11-11',INTERVAL 80 YEAR),NOW()) FROM DUAL;

SELECT TIMEDIFF ('10:11:11','06:10:10') FROM DUAL;

-- YEAR|Month|DAY|DATE(datetime)
SELECT YEAR(NOW) FROM DUAL;
SELECT MONTH(NOW()) FROM DUAL;
SELECT DAY(NOW()) FROM DUAL;
SELECT DAY('2013-11-11') FROM DUAL;
-- FROM_UNIXTIME() : 可以把一个unix_timestamp 秒数 时间戳
-- ，转成指定格式的日期
-- %Y-%m-%d 格式是规定好的，表示年月日
-- 意义 在开发中，可以存放一个整数，然后表示时间，通过FROM_UNIXTIME转换
SELECT FROM_UNIXTIME(1618483484,'%Y-%m-%d') FROM DUAL;
SELECT FROM_UNIXTIME(1618483484,'%Y-%m-%d %H:%i:%s') FROM DUAL;
-- unix_timestamp();: 返回的是1970-1-1 到现在的秒数
SELECT UNIX_TIMESTAMP()/(24*3600*365) FROM DUAL;

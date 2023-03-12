-- 这里在默认的情况下，shunping 用户只能看到一个默认的系统数据库

SELECT * FROM news;
INSERT INTO news VALUES(200,'上海新闻');

-- 能否修改，能否delete
UPDATE news SET content = '成都新闻'
	WHERE id = 100
















































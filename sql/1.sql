# 指令创建表
# 注意：hsp_db02创建表时，要根据需存的数据创建相应的列，并根据数据的类型定义相应的列类类型，例：user表(快速入门案例 create_tab01.sql)
# id        整型     [图形化，指令]
# name      字符串   
# password  字符串
# birthday  日期
CREATE TABLE `user` (
	id INT,
	`NAME` VARCHAR(255),
	`password` VARCHAR(255),
	`brithday` DATE)
	CHARACTER SET utf8 COLLATE utf8_bin ENGINE INNODB;
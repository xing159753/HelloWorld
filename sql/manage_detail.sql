-- 说明用户管理的细节
-- 在创建用户的时候，如果不指定host，则为%，% 表示所有的IP 都有连接权限
-- create user xxx;
CREATE USER jack
SELECT `host`,`user` FROM mysql.user

-- 你也可以这样创建指定
-- create user 'xxx'@'192.168.1.%'表示xxx用户在192.168.1.*的ip 可以登录mysql
CREATE USER 'smith'@'192.168.1.%'

-- 在删除用户的时候，如果host不是% ,需要明确指定，'用户'@'host值'
DROP USER jack -- 默认就是 drop user 'jack'@'%'
DROP USER 'smith'@'192.168.1.%'



















































































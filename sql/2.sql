# 练习：database03.sql备份hsp_db02和hsp_db03库中的数据，并恢复
# 备份，要在Dos下执行mysqldump指令其实在mysql安装目录\bin
# 这个备份的文件，就是对应的sql语句
mysqldump -u root -p -B hsp_db02 hsp_db03 > d:\\bak.sql

DROP DATABASE hsp_db01;

# 恢复数据库(注意：进入Mysql命令在执行)
source d:\\bak.sql
# 第二恢复方法，直接将bak.sql内容查询编辑器中，执行
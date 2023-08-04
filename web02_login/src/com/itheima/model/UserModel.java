package com.itheima.model;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

// 处理数据的JavaBean
public class UserModel {
//处理用户登录的方法：
    public User login(User user) throws SQLException {
        //连接数据库：通过传入的用户名和密码去数据库中今行查询
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        User existUser = queryRunner.query("select * from user where username = ? and password = ?",
                new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
        return existUser;
    }
}

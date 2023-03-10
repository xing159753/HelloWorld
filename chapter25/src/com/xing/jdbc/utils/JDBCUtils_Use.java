package com.xing.jdbc.utils;

import org.junit.Test;

import java.sql.*;

//演示该类如何使用JDBCUtils工具类，完成dml和select
public class JDBCUtils_Use {
    @Test
    public void testDML() {//insert ,update,delete

        //1. 得到连接
        Connection connection = null;

        //2. 组织一个sql
        String sql = "select * form actor ";
        ResultSet set = null;
        PreparedStatement preparedStatement = null;
        //3. 创建PreparedStatement对象
        try {
             connection = JDBCUtils.getConnection();
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1,5);//给?号赋值
            //执行,得到结果集
            preparedStatement.executeUpdate();
            //遍历结果集
            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
}

package com.itheima.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class JDBCDemo1 {
    @Test
    /**
     * JDBC的入门
     */
    public void demo1() {
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;

        try{
            //1. 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager.registerDriver(driver);
            //2. 获得连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_test3","root","123456");
            //3. 基本操作：执行SQL
            //3.1 获得执行SQL语句的对象
            statement = conn.createStatement();
            //3.2 编写SQL语句
            String sql = "select * from user";
            //3.3 执行SQL:
            rs = statement.executeQuery(sql);
            //3.4 遍历结果集：
            while(rs.next()) {
                System.out.println(rs.getInt("id") +" ");
                System.out.println(rs.getString("username") + " ");
                System.out.println(rs.getString("password") + " ");
                System.out.println(rs.getString("nickname") + " ");
                System.out.println(rs.getInt("age"));
                System.out.println();
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally{
            //4. 释放资源
            // 标准资源释放的代码：
            /*
            rs.close();
            statement.close();
            conn.close();
             */
            if(rs != null) {
                try{
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                rs = null;
            }
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                statement = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }
}

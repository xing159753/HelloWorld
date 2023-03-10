package com.xing.jdbc.resultset_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//演示select语句返回ResultSet,并取出结果
public class ResultSet_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        //1. 注册驱动
        Class.forName(driver);//建议写上
        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //3. 得到Statement
        Statement statement = connection.createStatement();
        //4. 组织sql
        String sql = "select id,name,sex,borndate form actor";

        //执行给定的sql语句，该语句返回单个 ResultSet对象
        /*
        * +----+--------+-----+---------------------+-------+
          | id | name   | sex | borndate            | phone |
          +----+--------+-----+---------------------+-------+
          |  1 | 刘德华 | 男  | 1970-12-12 00:00:00 | 110   |
          |  2 | jack   | 男  | 1990-12-12 00:00:00 | 112   |
          +----+--------+-----+---------------------+-------+
        * */
        /*
        *   老韩阅读debug代码 resultSet对象的结构
        * */
        ResultSet resultSet = statement.executeQuery(sql);
        //5. 使用while循环取出数据
        while (resultSet.next()) {//让光标向后移动，如果没有更多行，则返回false
            int id = resultSet.getInt(1);//获取该行的第1列
            String name = resultSet.getString(2);//获取该行第2列
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);


        }

        //6. 关闭连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}

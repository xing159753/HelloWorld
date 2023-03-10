package com.xing.jdbc.datasource;
import com.xing.jdbc.utils.JDBCUtils;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;

public class JDBCUtilsByDruid_USE {
    @Test
    public void testSelect() {//insert ,update,delete

        System.out.println("使用druid方式完成");
        //1. 得到连接
        Connection connection = null;

        //2. 组织一个sql
        String sql = "select * form actor ";
        ResultSet set = null;
        PreparedStatement preparedStatement = null;
        //3. 创建PreparedStatement对象
        try {
            connection = JDBCUtilsByDruid.getConnection();
            System.out.println(connection.getClass());//运行类型 com.mysql.jdbc.JDBC4Connection
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
            JDBCUtilsByDruid.close(null,preparedStatement,connection);
        }
    }
    // 使用老师的土方法来解决ResultSet = 封装 = ArrayList

    @Test
    public ArrayList<Actor> testSelectToArrayList() {//insert ,update,delete

        System.out.println("使用druid方式完成");
        //1. 得到连接
        Connection connection = null;

        //2. 组织一个sql
        String sql = "select * form actor ";
        ResultSet set = null;
        ArrayList<Actor> list =  new ArrayList<>();//创建ArrayList对象，存放actor对象
        PreparedStatement preparedStatement = null;
        //3. 创建PreparedStatement对象
        try {
            connection = JDBCUtilsByDruid.getConnection();
            System.out.println(connection.getClass());//运行类型 com.mysql.jdbc.JDBC4Connection
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,1);//给?号赋值
            //执行,得到结果集
            set = preparedStatement.executeQuery();
            //遍历结果集
            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                //把得到的resultSet 的记录，封装到Actor对象，放入到list集合
                list.add(new Actor(id,name,sex,borndate,phone));
            }
            //System.out.println("list集合数据=" + list);
            for (Actor actor : list) {
                System.out.println("id=" + actor.getId() + "\t" + actor.getName());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtilsByDruid.close(null,preparedStatement,connection);
        }
        //因为ArrayList和connection 没有任何联系，所有该集合可以复用
        return list;
    }
}

package com.itheima.jdbc.demo5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.itheima.jdbc.utils.JDBCUtils;
import org.testng.annotations.Test;

public class JDBCDemo5 {
    //JDBC的CRUD操作：PreparedStatement对象

    @Test
    public void demo4() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            //获得连接：
            conn = JDBCUtils.getConnection();
            //编写SQL:
            String sql = "select * form user";
            //预编译SQL:
            pstmt = conn.prepareStatement(sql);
            //设置参数
            //执行 SQL
            rs = pstmt.executeQuery();
            //遍历结果集
            while(rs.next()) {
                System.out.println(rs.getInt("id")+" "+rs.getString("username")+" "+rs.getString("password")+" "+rs.getString("nickname"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JDBCUtils.release(rs,pstmt,conn);
        }
    }

    @Test
    //删除操作
    public void demo3() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            //获得连接
            conn = JDBCUtils.getConnection();
            //编写SQL语句：
            String sql = "delete from user where id = ?";
            //预编译SQL:
            pstmt = conn.prepareStatement(sql);

            //设置参数
            pstmt.setInt(1,4);
            //执行SQL:
            int num = pstmt.executeUpdate();
            if(num > 0) {
                System.out.println("删除成功");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JDBCUtils.release(pstmt,conn);
        }
    }
}

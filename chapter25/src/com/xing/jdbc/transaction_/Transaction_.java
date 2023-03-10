package com.xing.jdbc.transaction_;

import com.xing.jdbc.utils.JDBCUtils;
import org.junit.Test;

import java.sql.*;

// 演示jdbc 中如何使用事务
public class Transaction_ {
    //没有使用事务
    @Test
    public void noTransaction() {
        //操作转账的业务
        //1. 得到连接
        Connection connection = null;

        //2. 组织一个sql
        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
                PreparedStatement preparedStatement = null;
        //3. 创建PreparedStatement对象
        try {
            connection = JDBCUtils.getConnection();//默认情况下，connection是默认提交
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();//执行第一条sql
            int i = 1 / 0;//抛出异常
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();//执行第3条sql

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
    //事务来解决
//    public void useTransaction() {
//        //没有使用事务
//        public void noTransaction() {
//            //操作转账的业务
//            //1. 得到连接
//            Connection connection = null;
//
//            //2. 组织一个sql
//            String sql = "update account set balance = balance - 100 where id = 1";
//            String sql2 = "update account set balance = balance + 100 where id = 2";
//            PreparedStatement preparedStatement = null;
//            //3. 创建PreparedStatement对象
//            try {
//                connection = JDBCUtils.getConnection();//默认情况下，connection是默认提交
//                //将connection 设置为不在提交
//                connection.setAutoCommit(false);//开启了事务
//                preparedStatement = connection.prepareStatement(sql);
//                preparedStatement.executeUpdate();//执行第一条sql
//                //int i = 1 / 0;//抛出异常
//                preparedStatement = connection.prepareStatement(sql2);
//                preparedStatement.executeUpdate();//执行第3条sql
//
//                //这里提交事务
//                connection.commit();
//
//            } catch (SQLException e) {
//                //这里我们可以进行回滚，即撤销执行的SQL
//                //默认回滚到事务开始的状态
//                System.out.println("执行发生了异常，撤销执行的sql");
//                try {
//                    connection .rollback();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//                e.printStackTrace();
//            } finally {
//                //关闭资源
//                JDBCUtils.close(null,preparedStatement,connection);
//            }
//        }
//    }
}

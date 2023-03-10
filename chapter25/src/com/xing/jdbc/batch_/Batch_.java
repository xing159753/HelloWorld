package com.xing.jdbc.batch_;

//演示java的批处理

import com.xing.jdbc.utils.JDBCUtils;
import org.junit.Test;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.beans.Transient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_ {
    //传统方法，添加5000条数据到 admin2
    @Test
    public void noBath() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2(null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();//开始时间
        for (int i = 0; i < 5000; i++) {//5000执行
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统的方式 耗时=" + (end - start));//传统的方式 耗时 = 10702
        //关闭连接
        JDBCUtils.close(null, preparedStatement,connection);
    }
    //使用批量方式添加数据
    @Test
    public void batch() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2(null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();//开始时间
        for (int i = 0; i < 5000; i++) {//5000执行
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"666");
            //将sql语句加入到批处理包中 -> 看源码
            /*
            * 1. 第一就创建 ArrayList - elementData  -> Object[]
            * 2. elementDate - > Object[] 就会存放我们预处理的sql语句
            * 3. 当elementData满后就按照1.5扩容
            * 4. 当添加指定的值后就executeBatch
            * 5. 批量处理会减少我们发送sql语句的网络开销而且减少编译次数音痴效率提高
            * */
            preparedStatement.addBatch();
            //当有1000条记录是，在批量执行
            if ((i + 1)  % 1000 == 0) {//满1000条sql
                preparedStatement.executeBatch();
                //清空一把
                preparedStatement.clearBatch();

            }
        }
        long end = System.currentTimeMillis();
        System.out.println("批量的方式 耗时=" + (end - start));//批量方式耗时 = 108
        //关闭连接
        JDBCUtils.close(null, preparedStatement,connection);
    }
}

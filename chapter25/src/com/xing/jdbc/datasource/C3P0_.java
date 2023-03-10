package com.xing.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//演示c3p0的使用
public class C3P0_ {
    //方式1. 相关参数，在程序中指定user,url,password等

    public void testC3P0_01() throws Exception {
        //创建一个数据原对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //2. 通过配置文件mysql.properties获取连接相关的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //读取相关的属性值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //给数据源 comboPooledDataSource 设置相关的参数
        //注意：连接管理是由 comboPooledDataSource 来管理
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        //设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        //最大连接数
        comboPooledDataSource.setMaxPoolSize(50);
        //测试连接池的效率，测试对mysql 5000次操作
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
        Connection connection = comboPooledDataSource.getConnection();//这个方法就是从DataSource接口实现的
        //System.out.println("连接ok");
        connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("c3p0 5000连接mysql 耗时=" + (end - start));//391
    }

    //第二中方式 使用配置文件模板来完成
    //1. 将c3p0提供的 c3p0.config.xml拷贝到src目录下
    //2. 该文件指定了连接数据库和连接池的相关参数
    @Test
    public void testC3P0_02() throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("hsp_edu");
        //测试5000次连接mysql
        long start = System.currentTimeMillis();
        System.out.println("开始执行");
        for (int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            System.out.println("连接ok");
            connection.close();
        }
        long end = System.currentTimeMillis();
        //413
        System.out.println("c3p0的第二中方式 耗时=" + (end - start));


    }
}

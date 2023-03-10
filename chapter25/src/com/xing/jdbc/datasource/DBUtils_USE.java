package com.xing.jdbc.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DBUtils_USE {
    //使用apache-DBUtils 工具类 + druid 完成对表的crud操作
    @Test
    public void testQueryMany() throws SQLException {//返回结果是多行的情况
        //1. 得到 连接(druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2. 使用DBUtils 类和接口，先引入DBUtils相关的jar,加入到本Project
        //3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 就可以执行相关的方法返回ArrayList结果集
        //String sql = "select * from actor where id >= ?";
        //注意：sql语句也可以查询部分列
        String sql = "select id, name from actor where id >= ?";
        //老韩解读
        //1. query 方法就是执行sql语句，得到resultset ----封装到-----ArrayList 集合中
        //2. 返回集合
        //3. connection:连接
        //4. sql:执行的sql语句
        //5. new BeanListHandler<>(Actor.class):在将resultset -> Actor对象 -> 封装到 ArrayList
        // 底层使用反射机制去获取Actor 类的属性，然后进行封装
        //6. 1 就是给sql语句中的？赋值，可以有多个值，因为是可变参数Object... params
        //7. 底层得到的resultset,会在query关闭，关闭PreparedStatement

        /**
         * 分析queryRunner.query方法：
         *
         */
        List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
        System.out.println("输出集合的信息");
        for (Actor actor : list) {
            System.out.println(actor);
        }

        //释放资源
        JDBCUtilsByDruid.close(null,null,connection);
    }
    //演示 apache-dbutils + druid 完成 返回的结果是单行记录（单个对象）
    @Test
    public void testQuerySingle() throws SQLException {
        //1. 得到 连接(druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2. 使用DBUtils 类和接口，先引入DBUtils相关的jar,加入到本Project
        //3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 就可以执行相关的方法返回单个对象
        String sql = "select * form actor where id = ?";
        // 老韩解读
        // 因为我们返回的单行记录-----单个对象，使用的Hander 是 BeanHandle
        List<Actor> actor = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 4);

        System.out.println(actor);
        //释放资源
        JDBCUtilsByDruid.close(null,null,connection);
    }
    //演示apache_dbutils + druid 完成查询结果是单行-返回的就是object
    public void testScalar() throws SQLException {

        //1. 得到 连接(druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2. 使用DBUtils 类和接口，先引入DBUtils相关的jar,加入到本Project
        //3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //4. 就可以执行相关的方法返回单行但列，返回的就是Object
        String sql = "select name form actor where id = ?";

        //老师解读：因为返回的是一个对象，使用的handler 就是 ScalarHandler
        Object obj = queryRunner.query(connection, sql, new ScalarHandler<>(), 4);
        System.out.println(obj);


        //释放资源
        JDBCUtilsByDruid.close(null,null,connection);
    }
    //演示apache-dbutils + druid 完成 dml (update,insert,delete)
    public void testDML() throws SQLException {
        //1. 得到 连接(druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2. 使用DBUtils 类和接口，先引入DBUtils相关的jar,加入到本Project
        //3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //4. 这里组织sql完成update,insert delete
        //String sql = "update actor set name = ? where id = ?";
        //String sql = "insert into actor values(null,?,?,?,?)";
        String sql = "delete from actor where id = ?";
        //老韩解读
        //1. 执行dml操作是 queryRunner.update()
        //2. 返回的值是受影响的行数affected: 受影响
        int afffectedRow = queryRunner.update(connection, sql, "林青霞","女","1966-10-10","116");
        System.out.println(afffectedRow > 0 ? "执行成功" : "执行没有影响到表");
        //释放资源
        JDBCUtilsByDruid.close(null,null,connection);
    }
}

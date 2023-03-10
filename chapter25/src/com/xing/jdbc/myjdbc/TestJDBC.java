package com.xing.jdbc.myjdbc;

public class TestJDBC {
    public static void main(String[] args) {
        //完成mysql的操作
        JdbcInterface jdbcInterface = new MysqlJdbcImpl();
        jdbcInterface.getConnection();//通过接口来调用实现类[动态绑定]
        jdbcInterface.crud();
        jdbcInterface.close();

        //完成oracle的操作
        System.out.println("========================");
        jdbcInterface = new OracleJdbcImpl();
        jdbcInterface.getConnection();//通过接口来调用实现类[动态绑定]
        jdbcInterface.crud();
        jdbcInterface.close();
    }
}

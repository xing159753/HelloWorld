package com.xing.interface_;
//B程序员连接Oracle
public class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");
    }
}

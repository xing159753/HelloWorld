package com.xing.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

//演示INetAddress类的使用
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//DESKTOP-P2LBU8H/192.168.199.121

        //2. 根据指定主机名 获取InetAddress对象
        InetAddress host1 = InetAddress.getByName("DESKTOP-P2LBU8H");
        System.out.println("host1=" + host1);

        //3. 根据域名返回 InetAddress对象，比如www.baidu.com对应
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);//

        //4. 通过 InetAddress对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2 对应的ip=" + hostAddress);

        //5. 通过InetAddress对象，获取对应的主机名/或者域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名=" + hostName);
    }
}

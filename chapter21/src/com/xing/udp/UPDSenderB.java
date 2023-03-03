package com.xing.udp;

import java.io.IOException;
import java.net.*;

public class UPDSenderB {
    public static void main(String[] args) throws IOException {

        //创建 DatagramSocket对象，准备在9998端口接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2.将需要发送的数据，封装到DatagramPacket对象
        byte[] data = "hello 明天吃火锅".getBytes();
        //说明：封装的 DatagramPacket对象的data内容字节数组，data.length,主机(IP),端口
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.12.1"), 9999);

        socket.send(packet);


        //3. =======接收从A端回复的信息

        //1. 构建一个 DatagramPacket 对象，准备接收数据
        //在前面讲解UDP协议时，老师说过一个数据包最大64k
        byte[] buf = new byte[1024];
         packet = new DatagramPacket(buf, buf.length);
        //2. 调用接收方法,将通过网络传输的 DatagramPacket对象
        //填充到packet对象
        //老师提示：当有数据包发送到本机的9998端口时，就会接收到数据
        //如果没有数据包发送到本机的9998端口，就会阻塞等待
        socket.receive(packet);

        //3. 可以把packet进行拆包，取出数据，并显示
        int length = packet.getLength();//实际接收到的数据长度
        packet.getData();//接收到数据

        String s = new String(data,0,length);
        System.out.println(s);

        //关闭资源
        socket.close();
        System.out.println("B端退出");
    }
}

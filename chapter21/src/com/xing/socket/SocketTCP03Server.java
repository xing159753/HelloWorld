package com.xing.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端，使用字符流方式读写
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {

        //思路
        //1. 在本机的9999端口监听，等待连接
        //   细节：要求在本机没有其他服务在监听9999
        // 细节：这个ServerSocket可以通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(999);
        System.out.println("服务端，在9999端口监听，等待连接...");
        //2. 当没有客户端连接9999端口时，程序会阻塞，等待连接
        //  如果有客户端连接，则返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket=" + socket.getClass());


        //3. 通过socket.getInputStream() 读取
        // 客户端写入到数据通道的数据，显示
        InputStream inputStream = socket.getInputStream();
        //4. IO读取 使用字符流,老师使用 InputStreamReader将 inputStream转成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);//输出

        //5. 获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        //使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello client 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示回复内容的结束
        bufferedWriter.flush();//注意需要手动的flush

        //设置结束标记
        socket.shutdownOutput();
        //6. 关闭流和socket
        bufferedReader.close();
        bufferedWriter.close();
        inputStream.close();
        serverSocket.close();//关闭
        //

    }
}

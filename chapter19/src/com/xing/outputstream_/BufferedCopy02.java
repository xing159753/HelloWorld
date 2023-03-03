package com.xing.outputstream_;

import java.io.*;

//演示使用BufferedOutputStream 和 BufferedInputStream使用
//使用他们，可以完成二进制文件拷贝
//思考： 字节流可以操作二进制文件，可以操作文本文件吗
public class BufferedCopy02 {
    public static void main(String[] args) {

        String srcFilePath = "e:\\Koala.jpg";
        String destFilePath = "e://hsp.jpg";

        //创建BufferedOutputStream对象BufferedInputStream对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //因为 FileInputStream 是 InputStream子类
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环的读取文件，并写入到 destFilePath
            byte[] buff = new byte[1024];
            int readLen = 0;
            //当返回-1时，就表示文件读取完毕
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff,0,readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流，关闭外层的处理流即可，底层回去关闭节点流
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

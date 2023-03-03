package com.xing.reader_;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
    }

    /*
    单个字符读取文件
     */
       @Test
    public void readFile01() {
           String filePath = "e:\\story.txt";
           FileReader fileReader = null;
           int data = 0;
           //char data = ' ';
           //1. 创建FileReader对象
           try {
               fileReader = new FileReader(filePath);
               //循环读取 使用read 单个字符读取
               while ((data = fileReader.read()) != -1);
               System.out.println((char) data);
           } catch (IOException e) {
               e.printStackTrace();
           } finally {
               try {
                   if(fileReader != null) {
                       fileReader.close();
                   }
               } catch (IOException e) {
                   e.printStackTrace();
               }

           }

       }

    /*
 字符数组读取文件
  */
    @Test
    public void readFile02() {
        System.out.println("readFile02");
        String filePath = "e:\\story.txt";
        FileReader fileReader = null;

       int readLen = 0;
       char[] buf = new char[8];
        //1. 创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read(buf),返回的是实际读取到的字符数
            //如果返回-1，说明到文件结束
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.println(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}

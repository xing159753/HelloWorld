package com.xing.draw;

import sun.java2d.pipe.SpanIterator;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{//JFrame对应窗口,可以理解成是一个画框
    //定义一个画板
    private MyPanel mp = null;
    public static void main(String[] args) {
        //演示如何在面板上画出圆形
        new DrawCircle();
        System.out.println("退出程序");
    }

    public DrawCircle() {//构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,300);
        //点击窗口的小x,程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}
//1. 先定义一个MyPanel,继承JPanel类，画图形就在面板上画
class MyPanel extends JPanel {

    //说明：
    //1. MyPanel对象就是一个画板
    //2. Graphics g 把 g理解成一支画笔
    //3. Graphics 提供了很多绘图的方法
    //Graphics g
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法 完成初始化
        //System.out.println("paint方法被调用了~");
        //画出一个圆形
       // g.drawOval(10,10,100,100);

        //演示绘制不同的图形
//        1. 画直线 drawLint(int x1,int y1,int x2,int y2)
        //g.drawLine(10,10,100,100);
//        2. 画矩形边框 drawRect(int x,int y,int width,int height)
        //g.drawRect(10,10,100,100);
//        3. 画椭圆边框 drawOval(int x,int y,int width,int height)
//        4. 填充矩形 fillRect(int x,int y,int width,int height)
        //设置画笔的颜色
        //g.setColor(Color.blue);
        //g.fillRect(10,10,100,100);
//        5. 填充椭圆 fillOval(int x,int y,int width,int height)
        //g.setColor(Color.red);
        //g.fillOval(10,10,100,100);
//        6. 画图片 drawImage(Image img,int x,int y,..)
        //1. 获取图片资源,bg.png 表示在该项目的根目录去获取 1.png 图片资源
        //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/1.png"));
        //g.drawImage(image,10,10,500,281,this);
//        7. 画字符串 drawString(String str,int x,int y)//写字
        //给画笔设置颜色和字体
        g.setColor(Color.red);
        g.setFont(new Font("隶书",Font.BOLD,50));
        //这里设置的 100，100，是“北京你好”左下角
        g.drawString("北京你好",100,100);
//        8. 设置画笔的字体 setFont(Font font)
//        9. 设置画笔的颜色setColor(Color c)


        /*
         1. 画直线 drawLint(int x1,int y1,int x2,int y2)
         2. 画矩形边框 drawRect(int x,int y,int width,int height)
         3. 画椭圆边框 drawOval(int x,int y,int width,int height)
         4. 填充矩形 fillRect(int x,int y,int width,int height)
         5. 填充椭圆 fillOval(int x,int y,int width,int height)
         6. 画图片 drawImage(Image img,int x,int y,..)
         7. 画字符串 drawString(String str,int x,int y)
         8. 设置画笔的字体 setFont(Font font)
         9. 设置画笔的颜色setColor(Color c)
         */
    }
}

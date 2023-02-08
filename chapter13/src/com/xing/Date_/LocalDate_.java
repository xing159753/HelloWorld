package com.xing.Date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期

        //老韩解读：
        //1. 使用now() 返回表示当前日期时间的对象
        LocalDateTime ldt = LocalDateTime.now();//LocalDateTime.now();//LocalTime.now()
        System.out.println(ldt);

        //2. 使用DateTimeFormatter 对象来进行格式化
        //   创建DateTimeFormatter对象
       // DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的日期=" + format);


        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());


        LocalDate now = LocalDate.now();//可以获取年月日
        LocalDate now2 = LocalDate.now();//可以获取时分秒

        //提供 plus 和 minus方法可以对当前时间进行加或者减
        //看看890天后，是什么时候 把 年月日 - 时分秒
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890天后=" + dateTimeFormatter.format(localDateTime));

        //看看在3456分钟以前是什么时候，把年月日 - 时分秒输出
        LocalDateTime localDateTime1 = ldt.minusMinutes(3456);
        System.out.println("3456分钟前 日期=" + dateTimeFormatter.format(localDateTime1));

//        ldt.getYear();
//        ldt.getMonthValue();
//        ldt.getMonth();
//        ldt.getDayOfMonth();
//        ldt.getHour();
//        ldt.getMinute();
//        ldt.getSecond();
    }
}

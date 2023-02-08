package com.xing.Date_;

import java.util.Date;
import java.time.Instant;

public class Instant_ {
    public static void main(String[] args) {


        //1. 通过静态方法 now() 获取表示当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);
        //2. 通过 from 可以把 Instant转成 Date
        Date date = Date.from(now);
        //3. 通过date 的 toInstant() 可以把 date 转成 Instant对象
        Instant instant = date.toInstant();

    }
}

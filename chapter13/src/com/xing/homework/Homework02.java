package com.xing.homework;

public class Homework02 {
    public static void main(String[] args) {

        String name = "jack";
        String pwd = "123456";
        String email = "jack@sohu.com";

        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜你，注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*
        输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
        要求：
        1. 用户名长度为2或3或4
        2. 密码长度为6 要求全是数字 isDigital
        3. 邮箱中包含@和. 并且@在. 的前面

        思路分析：
        1. 先编写方法userRegister(String name, String pwd, String email) {}
        2. 针对输入的内容进行校验，如果发现有问题，就抛出异常，给出提示
        3. 单独写一个方法，判断密码是否全部是数字字符 boolean
         */

    }
    public static void userRegister(String name, String pwd,String email) {

        //在加入一些校验
        if(!(name != null && pwd != null && email != null)) {
            throw new RuntimeException("参数不能为空");
        }

        //过关
        //第一关
        int userLength = name.length();
        if(!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }
        //第二关
        if(!(pwd.length() == 6 && idDigital(pwd))) {
            throw new RuntimeException("密码长度为6 要求全是数字");
        }

        //第三关
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和. 并且@在. 的前面");

        }

    }
    //3. 单独写一个方法，判断密码是否全部是数字字符 boolean
    public static boolean idDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}

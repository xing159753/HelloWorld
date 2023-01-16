package com.xing.object_;

public class ToString {
    public static void main(String[] args) {
        //Object 的toString() 源码
        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString() + " hashcode=" + monster.hashCode());

        System.out.println("==当直接输出一个对象时，toString 方法被默认的调用==");
        System.out.println(monster);//等价 monster.toString()
    }
}
class Monster {
    private String name;
    private String job;
    private double sal;
    //重写toString方法，输出对象属性
    //使用快捷键即可 alt + insert -> toString

    @Override
    public String toString() {//重写后，一般是把对象的属性输出
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }



    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
}
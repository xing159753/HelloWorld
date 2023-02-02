package com.xing.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        //new Cat("大黄");
       // System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        //再次调用getInstance
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);

    }

}
//希望在程序运行过程中，只能创建一个Cat对象
//使用单例模式
class Cat {
    private String name;
    public static int n1 = 999;
    private static Cat cat;//默认是null

    //步骤
    //1 仍然构造器私有化
    //2 定义一个static静态属性对象
    //3 提供一个public 的static方法，可以返回一个Cat对象
    //4 懒汉式，只有当用户使用getInstance时，才返回cat对象，后面再次调用时，会返回上次创建的cat对象
    //从而保证了单例
    private Cat(String name) {
        System.out.println("构造器调用 ");
        this.name = name;
    }
    public static Cat getInstance() {
        if(cat == null) {//如果还没有创建cat对象
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Constructor01 {
    public static void main(String[] args) {

        //当我们new 对象时 直接通过构造器指定名字和年龄
        Person4 p1 = new Person4("smith",80);
        System.out.println("p1的信息如下");
        System.out.println("p1对象name=" + p1.name);
        System.out.println("p1对象name=" + p1.age);

    }
}
class Person4 {
    String name;
    int age;
    //构造器 没有返回值 不能写void 名称和类一样
    public Person4(String pName, int pAge) {
        System.out.println("构造器被调用");
        name = pName;
        age = pAge;
    }
}

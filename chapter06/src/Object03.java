public class Object03 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.age = 10;
        p1.name = "小明";
        Person1 p2 = p1;
        System.out.println(p2.age);
    }
}

class Person1 {
    String name;
    int age;
}

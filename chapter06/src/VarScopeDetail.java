public class VarScopeDetail {
    public static void main(String[] args) {
        Person3 p1 = new Person3();
        p1.say();
        T2 t2 = new T2();
        t2.test();
        t2.test2(p1);

    }
}

class T2 {
    public void test() {
        Person3 p1 = new Person3();
        System.out.println(p1.name);
    }
    public void test2(Person3 p) {
        System.out.println(p.name);
    }
}

class Person3 {
    //局部变量不能加修饰符public protected private
    int age = 10;
    String name = "jack";

    public void say() {
        String name = "king";
        System.out.println("say() name=" + name);
    }

    public void hi() {
        String address = "上海";
        String name = "beijing";

    }
}

public class MethodExercise02 {
    public static void main(String[] args) {
        Person003 p = new Person003();
        p.name = "milan";
        p.age = 100;

        MyTools001 tools = new MyTools001();
        Person003 p2 = tools.copyPerson(p);
        System.out.println("p的属性 age=" + p.age + " 名字=" + p.name);
        System.out.println("p2的属性 age=" + p2.age + " 名字=" + p2.name);
        System.out.println(p == p2);
    }
}

class Person003 {
    String name;
    int age;
}
class MyTools001 {

    public Person003 copyPerson(Person003 p) {
        Person003 p2 = new Person003();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}

public class ConstructorExercise {
    public static void main(String[] args) {

        Person6 p1 = new Person6();
        System.out.println("p1的信息 name=" + p1.name + " age=" + p1.age);
        Person6 p2 = new Person6("scott", 23);
        System.out.println("p2的信息 name=" + p2.name + " age=" + p2.age);
    }
}
class Person6 {
    String name;
    int age;
    public Person6() {
        age = 18;
    }
    public Person6(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
}

public class ConstructorDetail {
    public static void main(String[] args) {
        Person5 p1  = new Person5("King",30);
        Person5 p2 = new Person5("Tom");


    }
}
class Dog {
    public Dog(String pName) {

    }
    Dog() {

    }
}
class Person5 {
    String name;
    int age;
    public Person5(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
    public Person5(String pName) {
        name = pName;
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Person7 p1 = new Person7("marry", 24);
        Person7 p2 = new Person7("smith", 20);
        System.out.println(p1.compareTo(p2));

    }
}
class Person7 {
    String name;
    int age;
    public Person7(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person7 p) {
//        if(this.name.equals(p.name) && this.age == p.age) {
//            return true;
//        } else {
//            return false;
//        }
        return this.name.equals(p.name) && this.age == p.age;
    }
}

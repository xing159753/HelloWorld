public class PropertiesDetail {
    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println("\n当前这人的信息");
        System.out.println("age=" + p1.age + "name=" + p1.name + "salary=" + p1.salary + "isPass=" + p1.isPass);
    }
}

class Person {
    int age;
    String name;
    double salary;
    boolean isPass;
}

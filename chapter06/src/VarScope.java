public class VarScope {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        cat1.eat();
        cat1.cry();
    }
}
class Cat1 {
    int age = 10;
    double weight;

    public void hi() {
        int num = 1;
        String address = "shanghai";
        System.out.println("num=" + num);
        System.out.println("address=" + address);
        System.out.println("weight=" + weight);
    }
    public void cry() {
        int n = 10;
        String name = "jack";
        System.out.println("在cry中使用属性 age=" + age);
    }

    public void eat() {
        System.out.println("在eat中使用属性 age=" + age);
    }
}

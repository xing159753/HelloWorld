public class Object01 {
    public static void main(String[] args) {
//        String cat1Name = "小白";
//        int cat1Age = 3;
//        String cat2Color = "白色";
//
//        String cat2Name = "小花";
//        int cat2Age = 100;
//        String cat1Color = "花色";


        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.Color = "白色";
        cat1.weight = 10;

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.Color = "花色";
        cat2.weight = 20;

        System.out.println("第一只猫的信息是" + cat1.name + " " + cat1.age + " " + cat1.Color + " " + cat1.weight);
        System.out.println("第二只猫的信息是" + cat2.name + " " + cat2.age + " " + cat2.Color + " " + cat2.weight);

    }
}

class Cat{
    String name;
    int age;
    String Color;
    double weight;

}
public class This01 {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1("大壮", 3);
        System.out.println("dog1的hashCode=" + dog1.hashCode());
        dog1.info();
        //Dog1 dog2 = new Dog1("大黄",2);
        //dog2.info();
        //System.out.println("dog2的hashCode=" + dog2.hashCode());
    }
}
class Dog1 {
    String name;
    int age;
//    public Dog1(String dName, int dAge) {
//        name = dName;
//        age = dAge;
//    }
    //如果我们构造器的形参，能够直接写成属性名，就跟好了
    //构造器的name age 是局部变量 ， 而不是属性
    public Dog1(String name, int age) {
        //this.name 就是当前对象的属性name
        this.name = name;
        this.age = age;
        System.out.println("this.hasCode=" + this.hashCode());
    }
    public void info() {//成员方法，输出属性x信息
        System.out.println("this.hasCode=" + this.hashCode());
        System.out.println(name + "\t" + age + "\t");
    }
}

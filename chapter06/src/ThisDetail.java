public class ThisDetail {
    public static void main(String[] args) {

//        T1 t1 = new T1();
//        t1.f2();
        T1 t2 = new T1();
        t2.f3();

    }
}
class T1 {
    //
    String name = "jack";
    int age = 24;
    public T1() {
        this("jack",23);
        //必须放在第一条语句
        System.out.println("T1() 构造器");
        //这里访问T(String name, int age)
    }
    public T1(String name, int age) {
        System.out.println("T(String name, int age) 构造器");
    }
    public void f1() {
        System.out.println("f1() 方法...");
    }
    public void f2() {
        System.out.println("f2() 方法...");
        f1();
        this.f1();
    }
    public void f3() {
        String name = "smith";
        System.out.println("name=" + name + " age=" + age);
        System.out.println("name=" + this.name + " age=" + this.age);
    }

}

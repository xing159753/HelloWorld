public class MethodParameter02 {
    public static void main(String[] args) {
        B001 b = new B001();
        int[] arr = {1,2,3};
        b.test100(arr);
        System.out.println("main 的 arr 数组");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        Person002 p1 = new Person002();
        p1.name = "jack";
        p1.age = 10;
        b.test200(p1);
        System.out.println("main 的p.age=" + p1.age);
    }
}
class Person002 {
    String name;
    int age;
}
class B001 {
    public void test200(Person002 p) {
        p.age = 10000;
    }
    public void test100(int[] arr) {
        arr[0] = 200;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}

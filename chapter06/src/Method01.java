public class Method01 {
    public static void main(String[] args) {

        Person001 p1 = new Person001();
        p1.speak();
        p1.cal01();
        p1.cal02(5);
        p1.cal02(10);

        int returnRes = p1.getSum(10,20);
        System.out.println("getSum方法返回的值=" + returnRes);
    }
}

class Person001 {
    String name;
    int age;
    public void speak() {
        System.out.println("我是一个好人");
    }
    public void cal01() {
        int res = 0;
        for(int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("cal02方法 计算结果=" + res);
    }
    public void cal02(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("cal02方法 计算结果=" + res);
    }
    public int getSum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}

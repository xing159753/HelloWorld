public class VarParameterDetail {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        T003 t1 = new T003();
        t1.f1(arr);
    }
}
class T003 {
    public void f1(int... nums) {
        System.out.println("长度=" + nums.length);
    }
    public void f2(double n1, String... names) {
        //一个形参列表中只能出现一个可变参数
    }
}

package a1;

public class TestCommandParam {
    //形参： String[] args
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数的值是： " + args[i]);
        }
    }
}

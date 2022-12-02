public class SwitchDetail {
    public static void main(String[] args) {
        //case子句中的值必须是常量（1,'a'）,而不能是变量

        char c = 'a';
        char c2 = 'c';
        switch(c) {
            case 'a' :
                System.out.println("ok1");
                break;
            case 'b' + 1 :
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
        }
        System.out.println("退出了switch,继续执行...");
    }
}
import java.util.Scanner;
public class BreakExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String password = "";
        int chance = 3;
        for(int i = 1; i <= 3; i++) {
            System.out.println("请输入名字");
            name = myScanner.next();
            System.out.println("请输入密码");
            password = myScanner.next();
            if("丁真".equals(name) && "666".equals(password)) {
                System.out.println("登录成功~");
                break;
            }
            chance--;
            System.out.println("你还有" + chance + "次登录机会");
        }
    }
}
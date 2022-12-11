public class RecursionExercise01 {
    public static void main(String[] args) {

        T001 t1 = new T001();
//        int n = -1;
//        int res = t1.fibonacci(-1);
//        if(res != -1) {
//            System.out.println("当n= " + n + "对应的斐波那契数=" + res);
//        }
        int day = 8;
        int peachNum = t1.peach(day);
        if(peachNum != -1) {
            System.out.println("第" + day + "天有" + peachNum + "个桃子");
        }
    }
}

class T001 {
    public int fibonacci(int n) {
        if(n >= 1) {

            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("要求输入的n>=1");
            return -1;
        }
    }
    public int peach(int day) {
        if(day == 10) {
            return 1;
        } else if( day >= 1 && day <=9 ) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day在1-10");
            return -1;
        }
    }
}

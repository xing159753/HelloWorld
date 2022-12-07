public class HomeWork04 {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 5;
//        int c = 3;
//        int num = a * 100 + b * 10 + c;
//        if( num = a*a*a + b*b*b + c*c*c ) {
            int n = 153;
            //n的百位 = n / 100; n的十位 = n % 100 /10; n的个位 = n % 10;

        int n1 = n / 100;
        int n2 = n % 100 /10;
        int n3 = n % 10;
            if(n == n1*n1*n1 + n2*n2*n2 + n3*n3*n3) {
                System.out.println(n + "是水仙花数");
        } else {
                System.out.println(n + "不是水仙花数");
            }
    }
}
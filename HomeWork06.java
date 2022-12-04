public class HomeWork06 {
    public static void main(String[] args) {
//        int n = 44;
//        int n1 = n % 5;
//        if(n1 != 0) {
//            System.out.println(n);
//        }

        int count = 0;
        for( int i = 1; i <= 100; i++) {
            if(i % 5 != 0) {
                count++;
                    System.out.print(i + "\t");
                if(count % 5 == 0) {
                    System.out.println("\n");
                }
            }
        }
    }
}
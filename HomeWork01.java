public class HomeWork01 {
    public static void main(String[] args) {
//        double money = 100000;
//        int sum = 0;
//        while(money > 50000) {
//            System.out.println("money=" +( money - (money * 0.05)));
//            money = money - (money * 0.05);
//            sum++;
//        }
//        while(money <= 50000) {
//            money -= 1000;
//            sum++;
//        }
//        System.out.println("sum=" + sum);


        double money = 100000;
        int count = 0;
        while(true) {
            if(money > 50000) {
                money = money - (money * 0.05);
                count++;
            } else if(money >= 1000 ){
                money -= 1000;
                count++;
            } else {
                break;
            }
        }
        System.out.println(money + " 可以过 " + count + " 路口...");
    }
}
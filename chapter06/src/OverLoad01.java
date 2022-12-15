public class OverLoad01 {
    public static void main(String[] args) {

        MyCalculator calculator = new MyCalculator();
        System.out.println(calculator.calculator(1,2,2));
    }
}

class MyCalculator {
    public int calculator(int n1, int n2) {
        return n1 + n2;
    }
    public double calculator(int n1, double n2) {
        return n1 + n2;
    }
    public double calculator(double n1, int n2) {
        return n1 + n2;
    }
    public int calculator(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

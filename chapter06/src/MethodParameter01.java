public class MethodParameter01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        AA002 aa002 = new AA002();
        aa002.swap(a,b);
        System.out.println("a=" + a + "b=" + b);
    }
}

class AA002 {
    public void swap(int a, int b) {
        System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\na和b交换后的值\na=" + a + "\tb" + b);
    }
}

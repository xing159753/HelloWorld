public class MultAndDivide {
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal * tax;
        System.out.println(subtotal + total);
        double perPerson = (subtotal + total) / 4;
        System.out.println(perPerson);
    }
}

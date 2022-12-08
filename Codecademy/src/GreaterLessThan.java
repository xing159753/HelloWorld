public class GreaterLessThan {
    public static void main(String[] args) {
        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        boolean canGraduate = creditsEarned > creditsToGraduate;
        System.out.println(canGraduate);
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
        boolean can = creditsToGraduate < creditsAfterSeminar;
        System.out.println(can);


    }
}

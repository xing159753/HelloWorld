public class WhileExercise {
    public static void main(String[] args) {
        int i = 1;
        int endNum = 100;
        while(i <= endNum) {
            if(i % 3 == 0) {
                System.out.println("i=" + i);
            }
            i++;
        }

        int j = 40;
        while(j <= 200) {
            if(j % 2 == 0) {
                System.out.println("j=" + j);
            }
            j++;
        }
    }
}
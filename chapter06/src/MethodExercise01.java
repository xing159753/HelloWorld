public class MethodExercise01 {
    public static void main(String[] args) {

        AA001 a = new AA001();
//        if(a.isOdd(1)) {
//            System.out.println("是奇数");
//        } else {
//            System.out.println("是偶数");
//        }

        a.print(4,4,'#');
    }
}

class AA001 {
    public boolean isOdd(int num) {
//        if(num % 2 != 0){
//            return true;
//        }else {
//            return false;
//        }
        //return num % 2 != 0 ? true: false;
        return num % 2 != 0;
    }
    public void print(int row, int col,char c) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
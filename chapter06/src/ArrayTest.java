public class ArrayTest {
    public static void main(String[] args) {

        MyTools005 myTools = new MyTools005();
        int[] arr = {10, -1, 8, 0, 34};
        myTools.bubble(arr);
        System.out.println("=====排序后的arr=====");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}

class MyTools005 {
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

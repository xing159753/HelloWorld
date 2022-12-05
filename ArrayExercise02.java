public class ArrayExercise02 {
    public static void main(String[] args) {
        int[] arr = {4, -1, 9, 10, 23, 444, 999,    222};
        //假定 max = arr[0] 是最大值， maxIndex = 0;
        //从下标1开始遍历arr ,如果max < 当前元素，说明 max 不是真正的最大值，我们就，max = 当前元素下标
        //当我们遍历这个数组arr后，max 就是真正的最大值，maxIndex最大值对应的下标
        int max = arr[0];
        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("max=" + max + " maxIndex" + maxIndex);
    }
}
public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //思路分析
        //1.定义初始数组 int[] arr = {1,2,3}  下标 0-2
        //2.定义一个新的数组 int[] arrNew = new int[arr.length + 1];
        //3.遍历 arr 数组，依次将 arr的元素拷贝到 arrNew数组
        //4.将 4 赋给 arrNew[arrNew.length - 1] = 4;把 4 赋给 arrNew 最后一个元素
        //5.让 arr 指向 arrNew ; arr = arrNew;
        int[] arrNew = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew;

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
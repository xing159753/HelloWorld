public class ArrayReverse02 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};


        //1. 先创建一个新的数组 arr2 大小 arr.length
        //2. 逆序遍历arr 将每个元素拷贝到arr2的元素中

        //3. 建议增加一个循环变量 j -> 0 -> 5;
        int[] arr2 = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }

        //4. 当for循环结束，arr2 就是一个逆序数组 {66,55,44,33,22,11}
        //5. 让arr指向 arr2 数据空间 ,此时 arr原来的数据空间就没有变量引用会被当做垃圾销毁
        arr = arr2;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
public class HomeWork04 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int insertNum = 23;
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(insertNum <= arr[i]) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            index = arr.length;
        }
        //System.out.println("index=" + index);
        //扩容  先创建一个新的数组 ， 大小 arr.length + 1;
        int[] arrNew = new int[arr.length + 1];
        //下面将arr的元素拷贝到 arrNew ,并且要跳过 index 位置；
         for(int i = 0, j = 0; i < arrNew.length; i++) {

             if(i != index) {
                 arrNew[i] = arr[j];
                 j++;
             } else {
                 arrNew[i] = insertNum;
             }
         }
         arr = arrNew;
        System.out.println("==============");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
    }
}
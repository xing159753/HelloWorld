public class HomeWork04 {
    public static void main(String[] args) {

        int[] oldArr = {12,23,34};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);
        //遍历newArr ,验证
        System.out.println("返回的newArr元素情况");
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }

    }
}
class A03 {
    public int[] copyArr(int[] oldArr) {
        //在堆中，创建一个长度为 oldArr.length 数组
        int[] newArr = new int[oldArr.length];
        //便利  oldArr,将元素拷贝到newArr

        for(int i = 0; i < oldArr.length; i++) {
            newArr[i]  = oldArr[i];
        }
        return newArr;
    }
}

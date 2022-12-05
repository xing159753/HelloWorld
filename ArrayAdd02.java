import java.util.Scanner;
public class ArrayAdd02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        //思路分析
        //1.定义初始数组 int[] arr = {1,2,3}  下标 0-2
        //2.定义一个新的数组 int[] arrNew = new int[arr.length + 1];
        //3.遍历 arr 数组，依次将 arr的元素拷贝到 arrNew数组
        //4.将 4 赋给 arrNew[arrNew.length - 1] = 4;把 4 赋给 arrNew 最后一个元素
        //5.让 arr 指向 arrNew ; arr = arrNew; 那么 原来的arr数组就被销毁了
        //6.创建一个Scanner 可以接收用户输入
        //7.因为用户什么时候退出不确定，老师使用 do - while + break来控制；


        do {
        int[] arrNew = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
            System.out.println("请输入你要添加的元素");
        int addNum = myScanner.nextInt();
        arrNew[arrNew.length - 1] = addNum;
        arr = arrNew;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
            System.out.println("是否继续添加 y/n");
        char key = myScanner.next().charAt(0);
        if( key == 'n') {
            break;
        }
        } while (true);
        System.out.println("你退出了添加...");
    }
}
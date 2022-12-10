public class MethodDetail {
    public static void main(String[] args) {

        AA aa = new AA();
        int[] res = aa.getSumAndSub(1,4);
        System.out.println("和=" + res[0]);
        System.out.println("差=" + res[1]);

    }
}

class AA {
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }
    public double f1 () {
        double d1 = 1.1 * 3;
        int n = 100;

        return n;
    }
    public void f2() {
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("hello4");
        int n = 100;
//        return ;
    }
}


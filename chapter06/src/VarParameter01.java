public class VarParameter01 {
    public static void main(String[] args) {

        HspMethod m = new HspMethod();
        System.out.println(m.sum(1, 2, 111));
    }
}
class HspMethod {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
    public int sum(int n1, int n2,int n3) {
        return n1 + n2 + n3;
    }
    public int sum(int n1, int n2,int n3,int n4) {
        return n1 + n2 + n3 + n4;
    }
    //(0-duo)
    public int sum(int... nums) {
        System.out.println("接收的参数个数=" + nums.length);
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}

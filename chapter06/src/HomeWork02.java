public class HomeWork02 {
    public static void main(String[] args) {

        String[] strs = {"jack","tom","milan","jerry"};
        A02 a02 = new A02();
        int index = a02.find("jerry ",strs);
        System.out.println("查找的index=" + index);
    }
}
class A02 {
    public int find(String findStr, String[] strs) {
        //直接遍历字符串数组，如果找到，则返回索引
        for(int i = 0; i < strs.length; i++) {
            if(findStr.equals(strs[i])) {
                return i;
            }
        }
        return -1;
    }
}

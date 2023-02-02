package com.xing.final_;

public class FinalDetail01 {
    public static void main(String[] args) {

        CC cc = new CC();
        new EE().cal();
    }
}
class AA {
    public final double TAX_RATE = 0.08;//1 定义时赋值
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    public AA() {//构造器中赋值
        TAX_RATE2 = 1.1;
    }
    {//在代码块中赋值
        TAX_RATE3 = 8.8;
    }
}
class BB {
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2;

    static {
        TAX_RATE2 = 3.3;
    }
}
//final类不能继承，但是可以实例化对象
final class CC {
}
class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}
class EE extends DD {

}

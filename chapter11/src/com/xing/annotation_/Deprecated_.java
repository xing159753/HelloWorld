package com.xing.annotation_;

public class Deprecated_ {
    public static void main(String[] args) {

        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}
//修饰摸个元素，表示该元素已过时
//2. 即不在推荐使用，但仍然可以使用
//3. 查看 @Deprecated 类的原码
//4. 可以修饰方法，类，字段， 包，参数，等等
//5. 可以做版本升级过度使用
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
 */
@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi() {

    }
}

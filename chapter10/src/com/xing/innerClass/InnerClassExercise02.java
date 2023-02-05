package com.xing.innerClass;

public class InnerClassExercise02 {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
//        Bell bell = new Bell() {
//            @Override
//            public void ring() {
//                System.out.println("懒猪起床了");
//            }
//        };
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
//        cellPhone.alarmClock(new Bell() {
//            @Override
//            public void ring() {
//                System.out.println("小伙伴们上课了");
//            }
//        });
    }
}
interface Bell {
    void ring();
}
class CellPhone {
    public void alarmClock(Bell bell) {
        System.out.println(bell.getClass());
        bell.ring();
    }
}

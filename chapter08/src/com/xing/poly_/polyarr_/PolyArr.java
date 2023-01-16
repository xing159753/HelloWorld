package com.xing.poly_.polyarr_;

public class PolyArr {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("marry",17,100);
        persons[2] = new Student("smith",11,10);
        persons[3] = new Teacher("scott",30,2000);
        persons[4] = new Teacher("king",50,20000);

        //循环遍历多态数组，调用say
        for (int i = 0; i < persons.length; i++) {
            //老师提示：person[i] 编译类型是 Person ,运行类型是根据实际情况有JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
            //这里大家聪明 使用 类型判断 + 向下转型
            if(persons[i] instanceof Student) {//判断person[i] 的运行内存是不是Student
                //((Student)persons[i]).study();
                Student student = (Student)persons[i];//向下转型
                student.study();
                //小伙伴也可以使用一条语句
            } else if(persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            } else if(persons[i] instanceof Person) {
                //System.out.println("你的类型有误，请自己检查...");
            } else {
                System.out.println("你的类型有误，请自己检查...");
            }
        }
    }
}

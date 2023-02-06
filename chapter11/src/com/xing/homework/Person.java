package com.xing.homework;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //实例化 Person对象唐僧 要求一般情况下用Horse作为交通工具，遇到大河是用Boat作为交通工具
    //这里涉及到一个编程思路，就是可以把具体的要求，封装成方法
    //如何不浪费，在构建对象是，传入的交通工具对象
    public void passRiver() {
        //先得到船
        //当前的 vehicle 属性是null 就获取一艘船

//        Boat boat = VehiclesFactory.getBoat();
//        boat.work();
        //如何防止始终使用的是传入的马 instanceOf
        //if(vehicles == null) {
        //vehicles instanceof Boat 是判断 当前的 vehicle 是不是Boat
        //vehicles = null : vehicles instanceof Boat ----> false
        //vehicles = 马对象 : vehicles instanceof Boat ----> false
        //vehicles = 船对象 : vehicles instanceof Boat ----> true

        if(!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common() {
        //得到马儿
        //判断一下，当前的 Vehicles 属性是 null ，就获取一批马
        if(!(vehicles instanceof Horse)) {
            //这里使用的 是多态
            vehicles = VehiclesFactory.getHorse();
        }
        //这里体现接口调用
        vehicles.work();
    }
    public void passFireHill() {
        if(!(vehicles instanceof Plane)) {
            //这里使用的 是多态
            vehicles = VehiclesFactory.getPlane();
        }
        //这里体现接口调用
        vehicles.work();
    }
}

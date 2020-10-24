package com.bgzyy.design.principle.single;

/**
 * 该类在类级别上遵循了单一职责原则，即按照不同的运行方式分为不同的类
 *      - 这样的方式遵循了单一职责原则，但是改动较大，比较臃肿
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/2.
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadTransportation roadTransportation = new RoadTransportation();
        WaterTransportation waterTransportation = new WaterTransportation();
        AirTransportation airTransportation = new AirTransportation();

        roadTransportation.run("拖拉机");
        airTransportation.run("小飞机");
        waterTransportation.run("大轮船");
    }
}

class RoadTransportation {
    public void run(String transportation) {
        System.out.println(transportation + " 在公路上运行！");
    }
}

class AirTransportation {
    public void run(String transportation) {
        System.out.println(transportation + " 在天上运行！");
    }
}

class WaterTransportation {
    public void run(String transportation) {
        System.out.println(transportation + " 在水中运行！");
    }
}
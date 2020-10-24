package com.bgzyy.design.principle.single;

/**
 * 该类就违反了单一原则，即 Transportation 处理了不同运行方式的交通工具，导致 “小飞机 在公路上运行”
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/2.
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Transportation transportation = new Transportation();
        transportation.run("拖拉机");
        transportation.run("大轮船");
        transportation.run("小飞机");
    }
}

class Transportation {
    public void run(String transportation) {
        System.out.println(transportation + " 在公路上运行！");
    }
}
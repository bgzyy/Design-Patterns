package com.bgzyy.design.principle.single;

/**
 * 该类在类 1 的基础上进行修改，在 Transportation 类上只是增加了方法
 *      - 严格的说该类是违反了单一原则的，只是在方法级别上遵循了单一原则
 *
 * 通常情况下我们应该遵循单一原则，即一个类负责一种职责，只有在逻辑足够简单，才可以在代码级别违反单一原则
 *
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/2.
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Transportation2 transportation = new Transportation2();
        transportation.roadRun("拖拉机");
        transportation.waterRun("大轮船");
        transportation.airRun("小飞机");
    }
}

class Transportation2 {
    public void roadRun(String transportation) {
        System.out.println(transportation + " 在公路上运行");
    }

    public void waterRun(String transportation) {
        System.out.println(transportation + " 在水中运行");
    }

    public void airRun(String transportation) {
        System.out.println(transportation + " 在天上运行");
    }
}
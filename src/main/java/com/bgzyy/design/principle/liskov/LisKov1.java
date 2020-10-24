package com.bgzyy.design.principle.liskov;

/**
 * 类 Add 的方法为计算两个数相加
 * 类 Sub 继承自 Add，并将其方法进行了重写，更改为两个数相减（违反了里氏替换原则）
 * 由于 Sub 重写了父类的方法，当客户端使用 Sub 的方法时还是以为是计算和，导致出错
 *
 * 修改：
 *      1. 让 Sub 和 Add 继承一个更加基础的类，目的是为了表明 Sub 和 Add 是一种类型的类
 *      2. 若 Sub 需要使用 Add 的方法可以使用组合的方式
 *
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/3.
 */
public class LisKov1 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        Integer val = sub.add(1, 4);
        System.out.println("1 + 4 = " + val);
    }
}

class Add {
    public Integer add(Integer i1, Integer i2) {
        return i1 + i2;
    }
}

class Sub extends Add {
    @Override
    public Integer add(Integer i1, Integer i2) {
        return i1 - i2;
    }
}
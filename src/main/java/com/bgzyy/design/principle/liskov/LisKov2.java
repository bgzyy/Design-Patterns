package com.bgzyy.design.principle.liskov;

/**
 * 类 Execute & Add1 同时继承于 Base，表明这两个类为一种类型
 * 此时 Execute 不再是继承自 Add，所以客户端不会再误以为 Execute 方法的执行逻辑
 *
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/3.
 */
public class LisKov2 {
    public static void main(String[] args) {
        Execute execute = new Execute();
        execute.add(1, 2);
        System.out.println("1 + 2 = " + execute.add(1, 2));
        System.out.println("4 - 2 = " + execute.sub(4, 2));
    }
}

class Base {}

class Add1 extends Base {
    public Integer add(Integer i1, Integer i2) {
        return i1 + i2;
    }
}

class Execute extends  Base {
    private Add1 add1 = new Add1();

    public Integer sub(Integer i1, Integer i2) {
        return i1 - i2;
    }

    public Integer add(Integer i1 , Integer i2) {
        return add1.add(i1, i2);
    }
}
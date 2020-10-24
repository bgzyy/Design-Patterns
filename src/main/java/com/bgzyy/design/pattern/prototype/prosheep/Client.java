package com.bgzyy.design.pattern.prototype.prosheep;

/**
 * 使用原型模式实现克隆，即使用 clone() 方法
 * @author bgzyy
 * @since 2019/9/10
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("bg", 12, "black");
        for (int i = 0; i < 5; i++) {
            System.out.println(sheep.clone());
        }
    }
}

package com.bgzyy.design.pattern.factory.method.pizzamethod.pizza;

/**
 * 由于存在很多种 Pizza，所以使用抽象类去定义基类，OOP
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public abstract class Pizza {
    //    披萨名
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    //    各种 Pizza 准备的原材料是不一样的，所以各个 pizza 自己实现
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " 披萨烤制中！");
    }

    public void cut() {
        System.out.println(name + " 披萨切割中！");
    }

    public void box() {
        System.out.println(name + " 披萨包装中！");
    }
}
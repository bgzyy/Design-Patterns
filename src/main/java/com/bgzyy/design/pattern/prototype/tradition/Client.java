package com.bgzyy.design.pattern.prototype.tradition;

/**
 *
 * @author bgzyy
 * @since 2019/9/10
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("bg", 12, "black");

        for (int i = 0; i < 5; i++) {
            Sheep sheepI = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
            System.out.println(sheepI);
        }
    }
}

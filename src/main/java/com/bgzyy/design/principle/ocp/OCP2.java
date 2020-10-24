package com.bgzyy.design.principle.ocp;

/**
 * 类 OCP2 是对 OCP1 的改进，使其符合 OCP 原则
 *      - 即当我们需要新添一种图形时只需要继承抽象类 Shape，使用方不需要做出任何更改，客户端便可以直接使用，OCP
 *      - 如我们新加 Circle 的绘制
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/5.
 */
public class OCP2 {
    public static void main(String[] args) {
        GraphicEditor2 graphicEditor2 = new GraphicEditor2();
        graphicEditor2.drawShape(new Rectangle1());
        graphicEditor2.drawShape(new Circle1());
    }
}

class GraphicEditor2 {
    public void drawShape(Shape1 shape) {
        shape.draw();
    }
}

abstract class Shape1 {
    int m_type;

    void draw() {
    }
}

class Rectangle1 extends Shape1 {

    public Rectangle1() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle1 extends Shape1 {
    public Circle1() {
        super.m_type = 2;
    }
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
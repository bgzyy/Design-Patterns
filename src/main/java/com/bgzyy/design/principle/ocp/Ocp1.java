package com.bgzyy.design.principle.ocp;

/**
 * 该方式的优点就是比较好理解，简单易操作，但是就是违反了设计模式的 OCP 原则，对扩展开放，对修改关闭【使用方】
 *
 * - 对于当前类，我们添加一个三角形(Triangle)的方法时，在提供方需要添加一个三角形的类，同时使用方需要添加对应的逻辑方法，所以违反了 OCP
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/3.
 */
public class Ocp1 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

// 绘制图形的类【使用方】
class GraphicEditor {

    public void drawShape(Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
    }

    private void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    private void drawCircle(Shape r) {
        System.out.println("圆形");
    }

}

// 提供方
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}
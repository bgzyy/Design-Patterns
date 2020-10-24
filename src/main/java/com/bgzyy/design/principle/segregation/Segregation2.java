package com.bgzyy.design.principle.segregation;

/**
 * Segregation2 相比于 Segregation1 将公共接口分为三个基本接口，接口方法如代码所示
 *      - 类 A 依赖于类 B，所以类 B 只需要实现 Interface1 & Interface2
 *      - 类 D 依赖于类 C，所以类 C 只需要实现 Interface1 & Interface3
 * 类 B 和类 C 分别实现了他们所需的接口，这就是接口隔离原则
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/2.
 */
public class Segregation2 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        D1 d1 = new D1();

        a1.depend1(new B1());
        a1.depend2(new B1());
        a1.depend3(new B1());

        d1.depend1(new C1());
        d1.depend4(new C1());
        d1.depend5(new C1());
    }
}

interface I1 {
    void method1();
}

interface I2 {
    void method2();

    void method3();
}

interface I3 {
    void method4();

    void method5();
}

class B1 implements I1, I2 {

    @Override
    public void method1() {
        System.out.println("类 B1 实现了方法 1");
    }

    @Override
    public void method2() {
        System.out.println("类 B1 实现了方法 2");
    }

    @Override
    public void method3() {
        System.out.println("类 B1 实现了方法 3");
    }
}

class C1 implements I1, I3 {

    @Override
    public void method1() {
        System.out.println("类 C1 实现了方法 1");
    }

    @Override
    public void method4() {
        System.out.println("类 C1 实现了方法 4");
    }

    @Override
    public void method5() {
        System.out.println("类 C1 实现了方法 5");
    }
}

class A1 {
    public void depend1(I1 i) {
        i.method1();
    }

    public void depend2(I2 i) {
        i.method2();
    }

    public void depend3(I2 i) {
        i.method3();
    }
}

class D1 {
    public void depend1(I1 i) {
        i.method1();
    }
    public void depend4(I3 i) {
        i.method4();
    }
    public void depend5(I3 i) {
        i.method5();
    }
}
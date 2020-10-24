package com.bgzyy.design.principle.segregation;

/**
 * 定义了接口 I，拥有 method1\method2\method3 五个方法
 * 定义了类 B，C 实现了接口 I，及其五个方法
 * - 定义了类 A 依赖类 B 的 method1 & method2 & method3
 * - 定义了类 D 依赖类 C 的 method1 & method4 & method5
 * <p>
 * 对于类 A & D，他们只依赖了其中一个或两个方法，比如 method4 & method5 对于类 A 是无用的，method2 & method3 对于类 D 是无用的
 * <p>
 * 所以说接口 I 对于类 B & C 不是最小接口，所以类 B & C 必须实现对他们无用的方法
 * <p>
 * 使用接口隔离原则处理：应当将接口 I 拆分为独立的几个接口，那么类 A & D 就只需要与他们需要的接口建立依赖
 * <p>
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/2.
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        D d = new D();

        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        d.depend1(new C());
        d.depend4(new C());
        d.depend5(new C());
    }
}

interface I {
    void method1();

    void method2();

    void method3();

    void method4();

    void method5();
}

class B implements I {

    @Override
    public void method1() {
        System.out.println("类 B 实现了方法 1");
    }

    @Override
    public void method2() {
        System.out.println("类 B 实现了方法 2");
    }

    @Override
    public void method3() {
        System.out.println("类 B 实现了方法 3");
    }

    @Override
    public void method4() {
        System.out.println("类 B 实现了方法 4");
    }

    @Override
    public void method5() {
        System.out.println("类 B 实现了方法 4");
    }
}

class C implements I {

    @Override
    public void method1() {
        System.out.println("类 C 实现了方法 1");
    }

    @Override
    public void method2() {
        System.out.println("类 C 实现了方法 2");
    }

    @Override
    public void method3() {
        System.out.println("类 C 实现了方法 3");
    }

    @Override
    public void method4() {
        System.out.println("类 C 实现了方法 4");
    }

    @Override
    public void method5() {
        System.out.println("类 C 实现了方法 5");
    }
}

class A {
    public void depend1(I i) {
        i.method1();
    }

    public void depend2(I i) {
        i.method2();
    }

    public void depend3(I i) {
        i.method3();
    }
}

class D {
    public void depend1(I i) {
        i.method1();
    }
    public void depend4(I i) {
        i.method4();
    }
    public void depend5(I i) {
        i.method5();
    }
}
package com.bgzyy.design.principle.inversion;

/**
 * 依赖倒置原则：声明一个抽象接口，使得 Person 类依赖于抽象接口，那么再有其他新的发送方式时只需要实现抽象接口，不需要去更改 Person 类
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/3.
 */
public class DependenceInversion2 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.receive(new Email1());
        person.receive(new WeChat());

        Person2 person2 = new Person2(new Email1());
        Person2 person3 = new Person2(new WeChat());

        person2.receive();
        person3.receive();
    }
}

interface IReceive {
    String getInfo();
}

class Email1 implements IReceive {

    @Override
    public String getInfo() {
        return "Email 接收到消息：Hello, Email";
    }
}

class WeChat implements IReceive {

    @Override
    public String getInfo() {
        return "WeChat 接收到消息：Hello, WeChat";
    }
}

// 通过接口传递实现依赖
class Person1 {
    public void receive(IReceive receive) {
        System.out.println(receive.getInfo());
    }
}

// 通过构造器方法依赖传递
class Person2 {

    private IReceive receive;

    public Person2(IReceive receive) {
        this.receive = receive;
    }

    public void receive() {
        System.out.println(receive.getInfo());
    }
}
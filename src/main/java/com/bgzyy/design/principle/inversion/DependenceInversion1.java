package com.bgzyy.design.principle.inversion;

/**
 * Person 类的 receive 方法通过接受 Email 对象执行对应的方法，但是当有一个新的方式发送消息时，比如 weChat etc.
 *      那么就需要新建一个 weChat 类，同时 Person 类需要新建对应的方法，
 * 解决方法：
 *      引入一个抽象的接口 IReceive，Person 类与 IReceive 接口发生依赖，其他方式发送消息实现 IReceive 接口即可
 *
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/3.
 */
public class DependenceInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "接收到消息：HelloWorld!";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
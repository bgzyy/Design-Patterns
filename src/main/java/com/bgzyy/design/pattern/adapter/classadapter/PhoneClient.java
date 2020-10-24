package com.bgzyy.design.pattern.adapter.classadapter;

/**
 * 由于电压不一样，充电需要使用适配器去充电，在适配器中转换电压
 * @author bgzyy
 * @since 2019/9/11
 */
public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
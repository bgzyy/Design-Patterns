package com.bgzyy.design.pattern.adapter.classadapter;

/**
 * @author bgzyy
 * @since 2019/9/11
 */
public class Phone {

    public void charging(IVoltage iVoltage) {
        System.out.println("充电中，当前电压为：" + iVoltage.output5());
    }
}

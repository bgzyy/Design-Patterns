package com.bgzyy.design.pattern.adapter.objectadapter;

/**
 * 中间适配器，对被适配者做以处理返回目标结果;
 * 实现手机充电器，将 220V 转换为 5V
 * 与类适配器模式不同的是对象适配器模式使用组合代替了继承
 *
 * @author bgzyy
 * @since 2019/9/11
 */
public class VoltageAdapter implements IVoltage {
    private Voltage voltage;

    public VoltageAdapter(Voltage voltage) {
        this.voltage = voltage;
    }

    @Override
    public Integer output5() {
        int srcV = voltage.output220();
        int dstV = srcV / 44;
        return dstV;
    }
}
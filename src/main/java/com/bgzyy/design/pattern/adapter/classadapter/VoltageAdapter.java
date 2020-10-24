package com.bgzyy.design.pattern.adapter.classadapter;

/**
 * 中间适配器，对被适配者做以处理返回目标结果
 * @author bgzyy
 * @since 2019/9/11
 */
public class VoltageAdapter extends Voltage implements IVoltage {
    @Override
    public Integer output5() {
        int srcV = output220();
        int dstV = srcV / 44;
        return dstV;
    }
}
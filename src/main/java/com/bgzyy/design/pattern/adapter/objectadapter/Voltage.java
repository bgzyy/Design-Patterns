package com.bgzyy.design.pattern.adapter.objectadapter;

/**
 * 被适配者，220V
 * @author bgzyy
 * @since 2019/9/11
 */
public class Voltage {
    Integer srcV = 220;

    public Integer output220() {
        return srcV;
    }
}
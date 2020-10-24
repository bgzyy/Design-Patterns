package com.bgzyy.design.pattern.builder.tradition;

/**
 * 抽象出房子的基类，定义统一流程
 * @author bgzyy
 * @since 2019/9/11
 */
public abstract class AbstractBuildHouse {
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoof();

    public void build() {
        buildBasic();
        buildWall();
        buildRoof();
    }
}
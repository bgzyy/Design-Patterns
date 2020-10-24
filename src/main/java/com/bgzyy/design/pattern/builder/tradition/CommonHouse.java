package com.bgzyy.design.pattern.builder.tradition;

/**
 * @author bgzyy
 * @since 2019/9/11
 */
public class CommonHouse extends AbstractBuildHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基！");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙！");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房子封顶！");
    }
}

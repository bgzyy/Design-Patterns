package com.bgzyy.design.pattern.builder.tradition;

/**
 * @author bgzyy
 * @since 2019/9/11
 */
public class HighBuilding extends AbstractBuildHouse {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基！");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙！");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼封顶！");
    }
}

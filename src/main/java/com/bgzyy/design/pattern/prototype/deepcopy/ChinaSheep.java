package com.bgzyy.design.pattern.prototype.deepcopy;

import java.io.*;

/**
 * @author bgzyy
 * @since 2019/9/11
 */
public class ChinaSheep implements Serializable, Cloneable {
    private String name;
    private String colour;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ChinaSheep{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public ChinaSheep(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public ChinaSheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
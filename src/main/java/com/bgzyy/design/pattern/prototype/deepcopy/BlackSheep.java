package com.bgzyy.design.pattern.prototype.deepcopy;

import java.io.*;

/**
 * @author bgzyy
 * @since 2019/9/10
 */
public class BlackSheep implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private ChinaSheep chinaSheep;

    /*
     * 深拷贝方式一：先克隆基本数据类型，再去克隆引用数据类型
     * */
    @Override
    protected Object clone() {
        BlackSheep blackSheep = null;
        try {
            blackSheep = (BlackSheep) super.clone();
            blackSheep.chinaSheep = (ChinaSheep) chinaSheep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return blackSheep;
    }

    /*
     * 深拷贝方式二：通过对象序列化实现（推荐）
     * */
    public Object deepClone() {
        ByteArrayOutputStream byteArrayOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        BlackSheep blackSheep = null;

        try {
//            序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//            当前这个对象以对象流的方式输出
            objectOutputStream.writeObject(this);

//            反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);

            blackSheep = (BlackSheep) objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
                byteArrayInputStream.close();
                objectOutputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return blackSheep;
    }

    @Override
    public String toString() {
        return "BlackSheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinaSheep=" + chinaSheep +
                '}';
    }

    public BlackSheep() {
    }

    public BlackSheep(String name, Integer age, ChinaSheep chinaSheep) {
        this.name = name;
        this.age = age;
        this.chinaSheep = chinaSheep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ChinaSheep getChinaSheep() {
        return chinaSheep;
    }

    public void setChinaSheep(ChinaSheep chinaSheep) {
        this.chinaSheep = chinaSheep;
    }
}
package com.example.testandroidframework.mvc.bean;

/**
 * Created by beijixiong on 2019/2/18.
 */

public class Student {
    private String name;
    private int stuImg;

    public Student() {
    }

    public Student(String name, int stuImg) {
        this.name = name;
        this.stuImg = stuImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuImg() {
        return stuImg;
    }

    public void setStuImg(int stuImg) {
        this.stuImg = stuImg;
    }
}

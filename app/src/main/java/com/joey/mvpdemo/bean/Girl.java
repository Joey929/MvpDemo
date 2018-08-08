package com.joey.mvpdemo.bean;

/**
 * describe：
 * author：WuQiuYun
 * date: 2018/8/7
 */

public class Girl {
    private String name;
    private String phone;
    private String describe;
    private int drawable;

    public Girl(String name, String phone, String describe, int drawable) {
        this.name = name;
        this.phone = phone;
        this.describe = describe;
        this.drawable = drawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

}

package com.duong.inheritanc.baiTap.btCircleCylinder;

public class Cylinder extends Circle {
    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getV() {
        return super.getS() * height;
    }

    @Override
    public String toString() {
        return super.toString() + height;
    }
}

package com.duong.AccessModifier;

public class Circless {
    private double radiuss = 1.0;
    private String colors = "red";
    public Circless() {
        this.radiuss = radiuss;
        this.colors = colors;
    }
    public double getRadiuss() {
        return radiuss;
    }

    public String getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "Circless{" +
                "radiuss=" + radiuss +
                ", colors='" + colors + '\'' +
                '}';
    }
}

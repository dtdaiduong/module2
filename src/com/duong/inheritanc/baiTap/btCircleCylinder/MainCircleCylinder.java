package com.duong.inheritanc.baiTap.btCircleCylinder;

import java.util.Scanner;

public class MainCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh");
        double r = scanner.nextDouble();
        System.out.println("Nhap chieu cao");
        double h = scanner.nextDouble();
        circle.setColor("red");
        System.out.println(circle.getColor());
        circle.setRadius(r);
        cylinder.setHeight(h);
        System.out.println("dien tich hinh tron: ");
        System.out.println(circle.getS());
        cylinder.setColor("blue");
        System.out.println(cylinder.getColor());
        System.out.println("dien tich hinh tru tron: ");
        System.out.println(cylinder.getV());
    }
}

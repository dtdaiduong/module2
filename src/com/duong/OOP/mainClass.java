package com.duong.OOP;

public class mainClass {
    public static void main(String[] args) {
//        Demo testClass= new Demo();
        Demo testClass1 = new Demo("duong", 18);
        System.out.println(testClass1.getName());
//        System.out.println(testClass.getName());
        System.out.println(testClass1.getAge());
        testClass1.setAge(20);
        System.out.println(testClass1.getAge());



    }
}

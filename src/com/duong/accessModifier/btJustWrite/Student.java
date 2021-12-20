package com.duong.accessModifier.btJustWrite;

public class Student {
    private String names = "John";
    private String classes = "C02";

    public Student() {
    }

    public String getClasses() {
        return classes;
    }

    public void setNames(String names) {

        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setClasses(String classes) {

        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "names='" + names + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

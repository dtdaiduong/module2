package com.duong.demo1;

public class Animal {
    public String name;
    public String age;

    public Animal() {
    }

    public Animal(String name, String noiO) {
        this.name = name;
        this.age = noiO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoiO() {
        return age;
    }

    public void setNoiO(String noiO) {
        this.age = noiO;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

package com.duong.inheritanc.demo;

public class Animal {
    private String name;
    private String place;
    void method(){

    }

    public Animal() {
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(String voice) {
        System.out.println(voice);
    }

    public void place(){
        System.out.println("tren can");;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

}

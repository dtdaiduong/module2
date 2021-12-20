package com.duong.inheritanc.demo;

public class Cat extends Animal {

    public void mew(){
        System.out.println("mew mew mew");
    }

    @Override
    public void eat(String voicecat) {
        System.out.println(voicecat);
    }

}

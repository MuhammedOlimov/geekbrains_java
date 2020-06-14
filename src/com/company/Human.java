package com.company;

public class Human implements Creatures, Runable, Jumpable{


    @Override
    public void jump() {
        System.out.println("Human is jumping");
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }
}

package com.company;

public class Cat implements Creatures, Jumpable, Runable{


    @Override
    public void jump() {
        System.out.println("Cat is jumping");
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }
}

package com.company;

public class Robocop implements Creatures, Jumpable, Runable{

    @Override
    public void jump() {
        System.out.println("Robocop is jumping");
    }

    @Override
    public void run() {
        System.out.println("Robocop is running");
    }
}

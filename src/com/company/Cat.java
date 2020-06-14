package com.company;

public class Cat implements Creatures, Jumpable, Runable{
    private int limitationJump;
    private int limitationRun;
    Cat(int limitationJump, int limitationRun){
        this.limitationJump = limitationJump;
        this.limitationRun = limitationRun;
    }

    @Override
    public boolean jump(int height) {
        if (limitationJump < height){
            return false;
        }
        System.out.println("Cat is jumping");
        return true;
    }

    @Override
    public boolean run(int length) {
        if (limitationRun < length){
            return false;
        }
        System.out.println("Human is running");
        return true;
    }
}

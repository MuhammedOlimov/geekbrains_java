package com.company;

public class Human implements Creatures, Runable, Jumpable{
    private int limitationJump;
    private int limitationRun;
    Human(int limitationJump, int limitationRun){
        this.limitationJump = limitationJump;
        this.limitationRun = limitationRun;
    }

    @Override
    public boolean jump(int height) {
        if (limitationJump < height){
            return false;
        }
        System.out.println("Human is jumping");
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

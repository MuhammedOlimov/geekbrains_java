package com.company;

public class Robocop implements Creatures, Jumpable, Runable{
    private int limitationJump;
    private int limitationRun;
    Robocop(int limitationJump, int limitationRun){
        this.limitationJump = limitationJump;
        this.limitationRun = limitationRun;
    }
    @Override
    public boolean jump(int height) {
        if (limitationJump < height){
            return false;
        }
        System.out.println("Robocop is jumping");
        return true;
    }

    @Override
    public boolean run(int length) {
        if (limitationRun < length){
            return false;
        }
        System.out.println("Robocop is running");
        return true;
    }
}

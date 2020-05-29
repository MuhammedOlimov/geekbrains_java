package com.company;

public class Animals {
    protected String name;
    protected boolean canRun;
    protected boolean canSwim;
    protected boolean canJump;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;

    Animals() {

    }

    Animals(String name, boolean canRun, boolean canSwim, boolean canJump, int maxRun, int maxSwim, double maxJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
        this.canSwim = canSwim;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }

    public void getVoice() {
        System.out.println("some kind of voice");
    }

    public void getInfo() {
        System.out.println(String.format(" name: %s%n maxRun: %s", name, maxRun));
    }

    protected boolean run(int limit) {
        if (canRun) {
            if (limit > maxRun) {
                return false;
            }
            return true;
        }
        return false;
    }

    protected boolean jump(int limit) {
        if (canJump) {
            if (limit > maxJump) {
                return false;
            }
            return true;
        }
        return false;
    }

    protected boolean swim(int limit) {
        if (canSwim) {
            if (limit > maxSwim) {
                return false;
            }
            return true;
        }
        return false;
    }
}

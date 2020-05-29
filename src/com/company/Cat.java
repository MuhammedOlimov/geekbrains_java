package com.company;

public class Cat extends Animals {
    public Cat(String name, boolean canRun, boolean canSwim, boolean canJump, int maxRun, int maxSwim, double maxJump) {
        super(name, canRun, canSwim, canJump, maxRun, maxSwim, maxJump);
    }
    @Override
    public void getVoice() {
        System.out.println("Я кооооот в сапогах");
    }
    public void meow() {
        System.out.println("meow meow");
    }
}

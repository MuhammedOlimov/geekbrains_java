package com.company;

public class Dog extends Animals {
        public Dog(String name, boolean canRun, boolean canSwim, boolean canJump,  int maxRun, int maxSwim, double maxJump){
        super(name, canRun, canSwim, canJump, maxRun, maxSwim, maxJump);
    }
    @Override
    public void getVoice() {
        System.out.println("Я Сабакаааа");
    }

    public void bark() {
        System.out.println("Af af");
    }
}

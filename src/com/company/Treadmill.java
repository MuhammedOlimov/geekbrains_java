package com.company;

public class Treadmill implements Obstacles {
    private int length;
    Treadmill (int length){
        this.length = length;
    }
    @Override
    public boolean doActivity(Creatures creatures) {
        return run((Runable) creatures);
    }
    private boolean run (Runable runable){
        return runable.run(length);
    }
}

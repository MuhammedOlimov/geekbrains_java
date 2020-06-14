package com.company;

public class Treadmill implements Obstacles {

    @Override
    public void doActivity(Creatures creatures) {
        run((Runable) creatures);
    }
    private void run (Runable runable){
        runable.run();
    }
}

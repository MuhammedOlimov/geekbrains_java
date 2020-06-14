package com.company;

public class Wall implements Obstacles {

    @Override
    public void doActivity(Creatures creatures) {
        jump((Jumpable) creatures);
    }
    private void jump(Jumpable jumpable){
        jumpable.jump();
    }
}

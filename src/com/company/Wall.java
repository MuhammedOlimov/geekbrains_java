package com.company;

public class Wall implements Obstacles {
    private int height;
    Wall (int height){
        this.height = height;
    }
    @Override
    public boolean doActivity(Creatures creatures) {
       return jump((Jumpable) creatures);
    }
    private boolean jump(Jumpable jumpable){
       return jumpable.jump(height);
    }
}

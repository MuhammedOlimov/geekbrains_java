package com.company;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void fillFood(int n) {
        food += n;
    }
    public int getQuantity() {
        return food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}

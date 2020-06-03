package com.company;

public class Cat {
    private String name;
    private boolean satiety;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
        if (p.getQuantity()>=appetite){
            p.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println(String.format("%s : not enough food on plate %s my appetite %s", name, p.getQuantity(), appetite));
        }
    }
    public void info (){
        System.out.println(String.format("My name %s my appetite %s i am %s", name, appetite, satiety));
    }
}
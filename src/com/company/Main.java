package com.company;

import java.util.Random;

public class Main {
    final static int QUANTITY_OF_CATS = 5;
    final static int QUANTITY_OF_APPETITE = 25;
    final static int QUANTITY_OF_FOOD = 50;
    public static void main(String[] args) {

        Plate plate = new Plate(0);
        plate.info();
        plate.fillFood(QUANTITY_OF_FOOD);
        plate.info();
        Cat[] cats =  fillCats();
        feedCats(cats, plate);
        plate.info();
        getStatusOfCats(cats);
        plate.fillFood(200);
        plate.info();
        feedCats(cats, plate);
        getStatusOfCats(cats);
        plate.info();
    }
    public static Cat[] fillCats (){

        Cat[] cats = new Cat[QUANTITY_OF_CATS];
        for (int i = 0; i < cats.length; i++) {
            Random random = new Random();
            int appetite = random.nextInt(QUANTITY_OF_APPETITE);
            cats[i] = new Cat("Barsik"+i, appetite);
        }
        return cats;
    }
    public static void feedCats (Cat[] cats, Plate plate){
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
    public static void getStatusOfCats (Cat [] cats){
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }
}

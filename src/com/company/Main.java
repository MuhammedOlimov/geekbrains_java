package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world");

        Animals animals = new Animals();
        Cat cat = new Cat("Barsik", true, false, true, 200, 0, 2 );
        Dog dog = new Dog("Bobik", true, true, true, 500, 10, 0.5 );
        Dog doggy = new Dog("Tuzik", true, true, true, 600, 10, 0.5 );

        dog.bark();
        dog.getInfo();
        dog.getVoice();
        System.out.println(dog.run(600));
        System.out.println();

        cat.meow();
        cat.getInfo();
        cat.getVoice();
        System.out.println(cat.run(150));
        System.out.println(cat.swim(150));
        System.out.println();

        doggy.bark();
        doggy.getInfo();
        dog.getVoice();
        System.out.println(doggy.run(550));
        System.out.println();

        dog.bark();
        dog.getInfo();
        dog.getVoice();
        System.out.println(dog.run(600));

    }
}

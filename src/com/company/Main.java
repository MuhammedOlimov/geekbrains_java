package com.company;

import javax.management.ObjectName;
import javax.naming.spi.ObjectFactoryBuilder;

public class Main {

    public static void main(String[] args) {

        Creatures[] creatures = new Creatures[]{
                new Cat(), new Human(), new Robocop(), new Human(), new Robocop()
        };

        Obstacles[] obstacles = {new Treadmill(), new Wall()};
        for (Creatures participant : creatures) {
            for (Obstacles obstacle : obstacles) {
                obstacle.doActivity(participant);
            }
        }

    }
}

package com.company;

import javax.management.ObjectName;
import javax.naming.spi.ObjectFactoryBuilder;

public class Main {

    public static void main(String[] args) {

        Creatures[] creatures = new Creatures[]{
                new Cat(10, 8),
                new Human(11, 9),
                new Robocop(15, 6),
                new Human(9, 6),
                new Robocop(21, 13)
        };

        Obstacles[] obstacles = {new Treadmill(9), new Wall(13)};
        for (Creatures participant : creatures) {
            for (Obstacles obstacle : obstacles) {
               if (obstacle.doActivity(participant)) {
                  break;
               }
            }
        }
    }
}

package com.company;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;
//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

public class GuessNumber {
    public static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {
        startGameGuessNumber();
      }
    public static void startGameGuessNumber(){
        final int ATTEMPTS = 3;
        final int MAX = 10;
        final int MIN = 0;
        do {
            boolean resultOfGame = false;
            Random random = new Random();
            int puzzled = random.nextInt(MAX);
            for (int i = 1; i < ATTEMPTS+1; i++) {
                System.out.println("Attempts: " + i);
                int answer = getNumberFromScanner("Guess a number from 0 to 9. You have "+ATTEMPTS+" attempts", MIN, MAX);
                if (checkAnswer(answer, puzzled)){
                    resultOfGame = true;
                    break;
                }
            }
            announceResults(resultOfGame);
        } while (continueGame());

    }
    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = scanner.nextInt();
        } while (x < min || x > max);
        return x;
    }
    public static boolean continueGame (){
        while (true){
            System.out.println("Do you want to continue? Type 1 to continue or 0 to finish game");
            byte continueGame = scanner.nextByte();
            if (continueGame==1){
                return true;
            } else if (continueGame==0){
                System.out.println("Game over");
                return false;
            } else {
                System.out.println("You write wrong answer");
            }
        }
    }
    public static void announceResults (boolean resultOfGame){
        if (resultOfGame){
            System.out.println("You win!");
        } else {
            System.out.println("You lose");
        }
    }
    public static boolean checkAnswer (int answer, int puzzled){
        if (answer==puzzled){
            return true;
        } else if (answer>puzzled){
            System.out.println("Your number is greater");
            return false;
        } else if (answer<puzzled){
            System.out.println("Your number is less");
            return false;
        }
        return false;
    }
}

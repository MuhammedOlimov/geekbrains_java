package com.company;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Random;
import java.util.Scanner;

//2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//        apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно, можно пользоваться:
//        String str = "apple";
//        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово
//        Используем только маленькие буквы
public class GuessWord {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        startGame();
    }
    public static void startGame (){
        System.out.println("Start game");
        String[] words = getWords();
        String puzzledWord = getPuzzledWord(words);
        String answer;
        do {
            answer = getWordFromUser();
        }while (checkAnswer(puzzledWord, answer));
    }
    public static boolean checkAnswer (String puzzledWord, String answer){
        if (puzzledWord.length()>=answer.length()){
            return printComparisonResult(puzzledWord, answer);
        } else {
            return printComparisonResult(answer, puzzledWord);
        }
    }
    public static boolean printComparisonResult(String maxString, String minString){
        byte QUANTITY_OF_ITER = 15;
        int result = 0;
        for (int i = 0; i < minString.length(); i++) {
            if (maxString.charAt(i)==minString.charAt(i)){
                result++;
                System.out.print(minString.charAt(i));
            } else {
                printSymbol('#',1);
            }
        }
        printSymbol('#',QUANTITY_OF_ITER-minString.length());
        System.out.println();
        if (result==minString.length()){
            System.out.println("You win!");
            return false;
        } else {
            return true;
        }
    }
    public static void printSymbol (char symb, int multiply){
        for (int i = 0; i < multiply; i++) {
            System.out.print(symb);
        }
    }
    public static String getWordFromUser (){
        System.out.println("Print word...");
        return scanner.nextLine();
    }
    public static String getPuzzledWord (String[] words){
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
    public static String[] getWords (){
        String[] words = {"apple", "orange", "lemon",
                "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon",
                "leak", "kiwi", "mango",
                "mushroom", "nut", "olive",
                "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        return words;
    }
}

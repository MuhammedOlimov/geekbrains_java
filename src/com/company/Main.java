package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        homeWork_1();
        homeWork_2();
        homeWork_3();



    }
    public static void homeWork_1() {

        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 0.0};
        String[] strings = {" one ", " two ", " three ", " four ", " five ", " six ", " seven "};
        try {
            swapTwoNumbersInArray(integers, 0, 2);
            swapTwoNumbersInArray(doubles, 0, 2);
            swapTwoNumbersInArray(strings, 0, 2);
        } catch (WrongPositionException e) {
            e.printStackTrace();
        }
        System.out.println("Swap result in integer array: " + Arrays.toString(integers));
        System.out.println("Swap result in double array: " + Arrays.toString(doubles));
        System.out.println("Swap result in string array: " + Arrays.toString(strings));
    }

    public static void  homeWork_2 (){
        Integer [] integersNumbers = {1, 5 , 8, 7, 8};
        Double [] doublesNumbers = {1.5, 5.4 , 8.4, 7.63, 8.7};
        ConvertArrayToList <Integer> convertArrayToList = new ConvertArrayToList<>();
        List<Integer> arrayList = convertArrayToList.convert(integersNumbers);

    }
    private static void swapTwoNumbersInArray(Object[] array, int startPos, int finishPos) throws WrongPositionException {
        if (startPos < 0 || startPos > array.length ||
                finishPos < 0 || finishPos > array.length || startPos == finishPos) {
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }
        array[startPos] = array[finishPos];
        array[finishPos] = array[startPos];
        array[startPos] = array[finishPos];
    }
    public static void homeWork_3() {
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple()); //picking apples in box
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange()); //picking apples in box
        Box<Orange> anotherBox = new Box<>();
        System.out.println("A box of apples weighs " + appleBox.getWeight()); //weight box with apples
        System.out.println("A box of oranges weight " + orangeBox.getWeight()); //weight box with apples
        System.out.println(appleBox.compare(orangeBox));
        orangeBox.replaceFruitsToAnotherBox(anotherBox);
        System.out.println(orangeBox.getBox());
        System.out.println(anotherBox.getBox());
    }
}


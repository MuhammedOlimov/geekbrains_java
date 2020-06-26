package com.company;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    public static void main(String[] args) {
	    fillWithZero(arr);
	    calcExp(arr);
	    //printArr(arr);
	    RunnableClass runnableClass = new RunnableClass(arr);
	    runnableClass.calcByDivide(arr);
    }
    public static void fillWithZero (float arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
    public static void calcExp (float arr[]){
        long time = System.currentTimeMillis();
        fillExp(arr);
        System.out.println("Def: " + (System.currentTimeMillis()-time));
    }
    public static void fillExp(float arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
        }
    }
    public static void printArr(float arr []){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

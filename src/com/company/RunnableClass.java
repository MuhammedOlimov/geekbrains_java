package com.company;

public class RunnableClass implements Runnable{
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float a1 [] = new float[h];
    static float a2 [] = new float[h];
    public RunnableClass(float[] arr) {
        this.arr = arr;
    }

    public void calcByDivide(float arr []){
        long time = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        new Thread(new RunnableClass(a1)).start();
        new Thread(new RunnableClass(a2)).start();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Div: " + (System.currentTimeMillis()-time));
        //printArr(arr);
    }

    @Override
    public void run() {
        fillExp(arr);
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

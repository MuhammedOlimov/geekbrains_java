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
// многопоточность
    public void calcByDivide(float arr []){

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        Thread t1 = new Thread(new RunnableClass(a1));
        Thread t2 = new Thread(new RunnableClass(a2));
        t1.start();
        t2.start();
        try {
            // Ожиданием пока все потом завершаться, перед подсчетом затраченного времени
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

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
        //System.out.println("finish");
    }
    public static void printArr(float arr []){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

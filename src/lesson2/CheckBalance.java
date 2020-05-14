package lesson2;
//задание 6

public class CheckBalance {
    public static void main(String[] args) {
        final int MASLENGTH = 10;
        final int MAX = 2;
        final int MIN = 0;
        int [] mas = new int[MASLENGTH];
        //int [] test =  {1, 1, 1, 2, 1};
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (MIN + (int)(Math.random()*MAX));
            System.out.print( mas[i]+" ");
        }
        System.out.println();
        System.out.println(checkBalance(mas));
        //System.out.println(checkBalance(test));

    }
    public static boolean checkBalance(int[] mas){
        int sumLeft = 0;
        for (int i = 0; i <mas.length; i++) {
            int sumRight = 0;
            sumLeft+=mas[i];
            for (int j = i+1; j < mas.length; j++) {
                sumRight+=mas[j];
            }
            if (sumLeft == sumRight){
                return true;
            }
            if (sumLeft>sumRight){
                return false;
            }
        }
        return false;
    }

}

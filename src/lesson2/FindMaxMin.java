package lesson2;
//задание 5
import java.util.Arrays;

public class FindMaxMin {
    public static void main(String[] args) {
        final int MASLENGTH = 10;
        final int MAX = 100;
        final int MIN = 0;
        int [] masMaxMin = new int[MASLENGTH];
        for (int i = 0; i < masMaxMin.length; i++) {
            masMaxMin[i] = (int) (MIN + (int)(Math.random()*MAX));
            System.out.print( masMaxMin[i]+" ");
        }
        System.out.println();
        Arrays.sort(masMaxMin);
        for (int j = 0; j < masMaxMin.length; j++) {
                System.out.print(masMaxMin[j]+" ");
        }
        System.out.println();
        System.out.println("MAX: " + masMaxMin[0]+ " " + "MIN: " +masMaxMin[masMaxMin.length-1]);
    }

}

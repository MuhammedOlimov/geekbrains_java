package lesson2;
// задание 7
public class Swap {
    public static void main(String[] args) {
        final int MASLENGTH = 10;
        final int MAX = 5;
        final int MIN = 0;
        int n = -1;
        int [] masSwap = new int[MASLENGTH];
        for (int i = 0; i < masSwap.length; i++) {
            masSwap[i] = (int) (MIN + (int)(Math.random()*MAX));
            System.out.print( masSwap[i]+" ");
        }
        swapMas(masSwap, n);
    }
    public static void swapMas(int[] masSwap, int n) {

        if (n>0){
            for (int i = 0; i < n; i++) {
                int buf = masSwap[0];
                masSwap [0] = masSwap[masSwap.length-1];
                for (int j = 1; j < masSwap.length-1; j++) {
                    masSwap[masSwap.length - j]=masSwap[masSwap.length-j-1];
                }
                masSwap[1] = buf;
            }
        } else if (n<0){
            for (int i = 0; i > n; i--) {
                int buf = masSwap[masSwap.length-1];
                masSwap[masSwap.length-1] = masSwap[0];
                for (int j = 1; j < masSwap.length-1; j++) {
                    masSwap[j-1]=masSwap[j];
                }
                masSwap[masSwap.length-2] = buf;
            }
        }
        System.out.println();
        for (int k = 0; k < masSwap.length; k++) {
            System.out.print(masSwap[k] + " ");
        }
    }
}

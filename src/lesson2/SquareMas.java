package lesson2;
// задание 4
public class SquareMas {
    public static void main(String[] args) {
        final byte MASLENGTH = 10;
        byte [] [] masMultiply =  new byte[MASLENGTH] [MASLENGTH];
        for (int i = 0; i < masMultiply.length; i++) {
            masMultiply[i][i] = 1;
        }
        for (int j = 0; j < masMultiply.length; j++) {
            for (int k = 0; k < masMultiply.length; k++) {
                System.out.print(masMultiply[j][k]+"  ");
            }
            System.out.println();
        }
    }

}

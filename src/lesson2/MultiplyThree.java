package lesson2;
// задание 2
public class MultiplyThree {
    public static void main(String[] args) {
        final byte MASLENGTH = 8;
        byte [] masMultiply = new byte[MASLENGTH];
        byte a = 0;
        for (int i = 0; i < masMultiply.length; i++) {
            masMultiply[i] = a;
            a+=3;
            System.out.print( masMultiply[i]+" ");
        }
    }

}

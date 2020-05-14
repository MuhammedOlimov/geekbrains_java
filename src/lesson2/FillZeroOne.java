package lesson2;
// задание 1
public class FillZeroOne {
    public static void main(String[] args) {
        final byte MASLENGTH = 10;
        final byte MAX = 2;
        final byte MIN = 0;
        byte [] masZeroOne = new byte[MASLENGTH];
        for (int i = 0; i < masZeroOne.length; i++) {
            masZeroOne[i] = (byte) (MIN + (byte)(Math.random()*MAX));
            System.out.print( masZeroOne[i]+" ");
        }
        for (int j = 0; j < masZeroOne.length; j++) {
            if (masZeroOne[j] == 1){
                masZeroOne[j] = 0;
            } else if (masZeroOne[j]==0){
                masZeroOne[j] = 1;
            } else {
                System.out.println("Не корректные данные...");
                break;
            }
        }
        System.out.println();
        for (int k = 0; k < masZeroOne.length; k++) {
            System.out.print( masZeroOne[k]+" ");
        }
    }
}

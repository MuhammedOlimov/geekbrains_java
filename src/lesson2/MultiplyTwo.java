package lesson2;

public class MultiplyTwo {
    public static void main(String[] args) {
        byte [] masMultiply =  { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        byte a = 0;
        for (int i = 0; i < masMultiply.length; i++) {

            if (masMultiply[i]<6){
                masMultiply[i]*=2;
            }
            System.out.print( masMultiply[i]+" ");
        }
    }

}

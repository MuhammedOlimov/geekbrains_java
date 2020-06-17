package com.company;

public class Main {
    final static int MAXSIZE = 4;
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
	char mass[][] = new char[4][4];
        mass[0][0] = '1';
        mass[0][1] = '1';
        mass[0][2] = '1';
        mass[0][3] = '1';

        mass[1][0] = '1';
        mass[1][1] = 'a';
        mass[1][2] = '1';
        mass[1][3] = '1';

        mass[2][0] = '1';
        mass[2][1] = '1';
        mass[2][2] = '1';
        mass[2][3] = '1';

        mass[3][0] = '1';
        mass[3][1] = '1';
        mass[3][2] = '1';
        mass[3][3] = 's';
	    checkMass(mass);
        System.out.println(sumMass(mass));
    }
    public static void checkMass (char mass [][] ) throws MyArraySizeException{
        if (mass.length>MAXSIZE){
            throw new MyArraySizeException("Mass is not 4x4");
        }
    }
    public static int sumMass (char mass [][]) throws MyArrayDataException{
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                try {
                    result += Integer.parseInt(String.valueOf(mass[i][j]));
                } catch (NumberFormatException e){
                    System.out.println(String.format("Error in: i=%s, j=%s", i, j));
                }

            }
        }

        return result;
    }
}

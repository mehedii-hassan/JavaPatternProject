package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class PatternType3 {

    static Scanner myScanner = new Scanner(System.in);

    //pattern type-----------------
//            1 
//            1 2 
//            1 2 3 
//            1 2 3 4 
//            1 2 3 4 5 
//            1 2 3 4 5 
//            1 2 3 4 
//            1 2 3 
//            1 2 
//            1 
    public static void main(String[] args) {
        System.out.print("please enter a number : ");
        int number = myScanner.nextInt();

        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
//                System.out.print(column+" ");
//                System.out.print(row + " ");
//                System.out.print((char) ('A' + (column - 1)) + " ");
                System.out.print((char) ('A' + (row - 1)) + " ");
//                System.out.print("*" + " ");

            }
            System.out.println("");

        }
        for (int row = number-1; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
//                System.out.print(column+" ");
//                System.out.print(row+" ");
//                System.out.print((char) ('A' + (column - 1)) + " ");
                System.out.print((char) ('A' + (row - 1)) + " ");
//                System.out.print("*" + " ");

            }
            System.out.println("");

        }

    }

}

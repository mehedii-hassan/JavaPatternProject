package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class SquareStarPattern {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("please give a row number : ");
        int row = myScanner.nextInt();
        System.out.print("please give a column number : ");
        int column = myScanner.nextInt();

        while (row != 0 || column != 0) {

            if (row == 0 || column == 0) {
                System.out.println("\nEnter row or column greater than 0 : ");
                row = myScanner.nextInt();
                column = myScanner.nextInt();
               // continue;

            } else {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print("*" + " ");

                    }
                    System.out.println("");

                }

                System.out.println("\n");
                System.out.print("please give a row number : ");
                row = myScanner.nextInt();
                System.out.print("please give a column number : ");
                column = myScanner.nextInt();
            }

        }

    }

}

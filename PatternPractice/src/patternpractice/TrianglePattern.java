package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class TrianglePattern {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter  a number : ");
        int userInput = myScanner.nextInt();

        for (int row = 1; row <= userInput; row++) {

            for (int column = 1; column <= userInput; column++) {
                if (column == 1 || row == userInput || row == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");

        }
    }

}

package techcrashcourse.com;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class HollowSquarePattern {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = myScanner.nextInt();
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                if (row == 0 || row == number - 1 || column == 0 || column == number - 1) {
                    System.out.print("*"+" ");

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}

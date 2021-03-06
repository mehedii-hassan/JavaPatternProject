/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techcrashcourse.com;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class HollowRectangularStarPattern {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of row and column : ");
        int row = myScanner.nextInt();
        int column = myScanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == column - 1) {
                    System.out.print("*" + " ");

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}

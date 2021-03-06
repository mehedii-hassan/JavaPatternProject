/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class Xshape {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter  a number : ");
        int userInput = myScanner.nextInt();

        for (int row = 1; row <= userInput; row++) {

            for (int column = 1; column <= userInput; column++) {
                if ( row == column||row+column==userInput+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");

        }
         
    }
    
}

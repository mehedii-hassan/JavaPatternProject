/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techcrashcourse;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class HutStarPattern {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        //Now printing space--------------
        for (int row = 1; row <= num; row++) {
            for (int column = 1; column <= num - row; column++) {
                System.out.print(" ");
            }
//            System.out.println("");

            //Now printing star******************
            for (int column = 1; column <= row * 2 - 1; column++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int row = 1; row <= 3; row++) {
            //Now printing star---------in the botom left
            for (int column = 1; column <= 3; column++) {
                System.out.print("*");
            }
            //space printing ----------
            for (int column = 3+1; column <(num * 2 - 1) - 2; column++) {
                System.out.print(" ");
            }
            // System.out.println("");

            for (int column = (num * 2 - 1) - 2; column <= num * 2 - 1; column++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}

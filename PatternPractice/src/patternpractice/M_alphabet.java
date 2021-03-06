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
public class M_alphabet {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a number : ");
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
//                arr[0][j] = 1;
                arr[i][0] = 1;
//                System.out.print(arr[0][j]);
                System.out.print(arr[i][0]);

            }
//            System.out.println("");

        }
    }

}

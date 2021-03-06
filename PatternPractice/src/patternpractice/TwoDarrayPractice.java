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
public class TwoDarrayPractice {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of 2Darray : ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        //Now taking the input for 2Darray------------------
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print("array[" + row + "][" + column + "]: ");
                arr[row][column] = scanner.nextInt();

            }

        }
        System.out.println("\n");
        //Now printing the array elements -------------------
        System.out.println("2Darray: ");
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(arr[row][column] + "   ");

            }
            System.out.println(" ");

        }
        //Now calculating the maximum sum of hourglass
        System.out.println("");
        int maxSum = 0;
        for (int row = 0; row < n - 1; row++) {
            for (int column = 0; column < n - 1; column++) {
                int sum = arr[row][column] + arr[row][column + 1] + arr[row + 1][column + 1];
                System.out.println("Sum : " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

        }
        System.out.println("MAXSUM : " + maxSum);

    }

}

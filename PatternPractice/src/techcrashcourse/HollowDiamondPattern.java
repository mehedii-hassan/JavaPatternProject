package techcrashcourse;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class HollowDiamondPattern {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        double a = 10.60;
        float c = (float)a;
        System.out.println(c);
        //int n = myScanner.nextInt();
////        for (int row = 1; row <= n; row++) {
//        for (int row = 1; row <= n * 2 - 1; row++) {
//            
//            //printing star-----------
//            for (int column = 1; column <= n * 2 - 1; column++) {
//                if (row + column == n + 1 || column - row == n - 1 || row - column == n - 1||row+column==n*3-1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
        //2nd way to print next part
//        for (int row = n-1; row >= 1; row--) {
//             
//            //printing star-----------
//            for (int column = 1; column <= n * 2 - 1; column++) {
//                if (row + column == n + 1 || column - row == n - 1) {
//
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
    }

}

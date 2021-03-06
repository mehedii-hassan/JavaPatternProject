 
package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class pattern22 {
static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter a number : ");
        int number = myScanner.nextInt();
        for (int row = 1; row <= number; row++) {
            //space printing -----------
            for (int column = 1; column <= number - row; column++) {
                System.out.print(" ");

            }
            for (int column = 1; column <= row; column++) {
                System.out.print(column);

            }
            for (int column = row - 1; column >= 1; column--) {
                System.out.print(column);

            }
            System.out.println("");

        }
        
        for (int row = number -1; row >= 1; row--) {
            
            //space printing ------------
            for (int column = 1; column <= number-row; column++) {
                System.out.print(" ");
                
            }
            //value printing ----------
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
                
            }
            for (int column = row-1; column >=1; column--) {
                System.out.print(column);
                
            }
            System.out.println("");
            
        }
    }
}

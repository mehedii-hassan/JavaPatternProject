 
package techcrashcourse.com;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class InvertedRightAnglePattern {
       static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = myScanner.nextInt();
        for (int row = number; row >=1; row--) {
            for (int column = 0; column <row; column++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
    
}

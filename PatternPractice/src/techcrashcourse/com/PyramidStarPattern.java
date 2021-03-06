 
package techcrashcourse.com;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class PyramidStarPattern {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please give a number : ");
        int n = myScanner.nextInt();
        
        for (int row = 1; row <=n; row++) {
            //printing space ----------------
            for (int column = 1; column <=n-row; column++) {
                System.out.print("-");
               
            }
            //printing star-----------------------
            for (int column = 1; column <=row*2-1; column++) {
                System.out.print("*");
               
            }
            System.out.println("");
            
        }
    }
    
}

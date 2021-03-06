 
package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class RightAngelTriangel {
    
    static Scanner myScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("please enter your number : ");
        int userInput = myScanner.nextInt();
        
        for (int row = 1; row <= userInput; row++) {
            for (int column = 1; column <=row; column++) {
                System.out.print(column+"\t");
                
            }
            System.out.println("");
            
        }
        
        
        
        
    }
    
}

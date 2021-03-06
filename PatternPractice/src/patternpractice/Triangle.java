 
package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class Triangle {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        //pattern type --------------
//            A 
//            A B 
//            A B C 
//            A B C D 
//            A B C D E
        
        System.out.print("please enter a number : ");
       int number = myScanner.nextInt();
       
        for (int row = 1; row <=number; row++) {
            for (int column = 1; column <=row; column++) {
//                System.out.print(row+"\t");
//                System.out.print((column%2)+"\t");
//                System.out.print((row%2)+"\t");
                System.out.print((char)('A'+(column - 1))+" ");
//                System.out.print((char)('A'+(row - 1))+"\t");
//                System.out.print("#");
//                System.out.print("*"+" ");
                
            }
            System.out.println("");
            
        }
       
        
    }
    
}

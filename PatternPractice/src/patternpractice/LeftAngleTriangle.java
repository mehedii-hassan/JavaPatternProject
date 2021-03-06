package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class LeftAngleTriangle {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Please enter your Triangle length :  ");
        int length = myScanner.nextInt();
        
        for (int row = 1; row <=length; row++) {
            //space printing ------------
            for (int column = 1; column <=length - row; column++) {
                System.out.print(" ");
                
            }
            
            //value printing ---------------
            for (int column = 1; column <=row; column++) {
                System.out.print(column);
                
            }
            
            System.out.println("");
       
        }
        for (int row = length-1; row >=1; row--) {
            //space printing ------------
            for (int column = 1; column <=length - row; column++) {
                System.out.print(" ");
                
            }
            
            //value printing ---------------
            for (int column = 1; column <=row; column++) {
                System.out.print(column);
                
            }
            
            System.out.println("");
       
        }

    }

}

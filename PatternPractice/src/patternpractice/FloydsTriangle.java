package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class FloydsTriangle {

                //1  
                //2 3  
                //4 5 6  
                //7 8 9 10  
                //11 12 13 14 15 
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter  a number : ");
        int userInput = myScanner.nextInt();
        int count = 0;

        for (int row = 1; row <= userInput; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print(++count+" ");
            }
            System.out.println(" ");

        }

    }

}

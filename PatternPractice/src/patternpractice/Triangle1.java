package patternpractice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class Triangle1 {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //pattern type -----------------
//                    # # # # # 	
//                    # # # # 	
//                    # # # 	
//                    # # 	
//                    #

        System.out.print("please enter a number : ");
        int number = myScanner.nextInt();

        for (int row = number; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
//                        System.out.print((column%2)+" ");
//                        System.out.print((row%2)+" ");
//                        System.out.print(column+" ");
//                        System.out.print(row+" ");
//                        System.out.print((char)('A'+(column-1))+" ");
//                        System.out.print((char)('A'+(row-1))+" ");
//                        System.out.print("*"+" ");
                System.out.print("#" + " ");
            }
            System.out.println("\t");

        }

    }

}

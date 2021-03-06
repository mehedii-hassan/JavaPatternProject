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
public class Rectangular {
    //rectangular pattern------------
    
//    *****
//    *   *
//    *   *
//    *   *
//    *****

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter your Triangle length :  ");
        int length = myScanner.nextInt();

        for (int row =1; row<=length; row++) {
            //space printing ------------
            for (int column = 1; column <= length; column++) {
                if(row==1||row==length||column==1||column==length){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
          
            System.out.println();
        }
    }
}

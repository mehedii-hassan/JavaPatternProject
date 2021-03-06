package techcrashcourse.com;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class ExponentialIncreasingPattern {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("please give a row number : ");
        int n = myScanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < powerCalculate(2, i); j++) {
                System.out.print(i+1);

            }
            System.out.println("");

        }

    }
    
    static  int powerCalculate(int a,int i){
        int result=1;
        if(i==0){
        return result;
        }else{
        for (int k = 1; k <= i; k++) {
          result*=a;  
        }
        return result;
        }
    
    }
            

}

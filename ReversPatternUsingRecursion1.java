/*WRITE A PROGRAM USING METHOD TO PRINT THE FOLLOWING PATTERN USING RECURSION.
 *****
 ****
 ***
 **
 *
 */

import java.util.Scanner;
public class ReversPatternUsingRecursion1 {
    static void pattern(int n){
        if(n>0){
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            pattern(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row:- ");
        int n=sc.nextInt();
        pattern(n);
    }
}


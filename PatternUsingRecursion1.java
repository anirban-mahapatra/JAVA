/*WRITE A PROGRAM USING METHOD TO PRINT THE FOLLOWING PATTERN USING RECURSION
 *
 **
 ***
 ****
 *****
 */

import java.util.*;
public class PatternUsingRecursion1 {
    static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row:- ");
        int n=sc.nextInt();
        pattern(n);
    }
}

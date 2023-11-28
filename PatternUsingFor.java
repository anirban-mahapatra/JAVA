/*
WRITE A JAVA PROGRAM TO PRINT FOLLOWING PATTERN USING FOR:
****
***
**
*

 */

import java.util.Scanner;
public class PatternUsingFor {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of * print in a row:- ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

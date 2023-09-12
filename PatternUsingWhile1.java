/*
WRITE A JAVA PROGRAM TO PRINT FOLLOWING PATTERN USING WHILE:
****
***
**
*

 */

package question_solution;
import java.util.Scanner;
public class PatternUsingWhile1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of * print in a row:- ");
        int n=sc.nextInt();
        
        int i=n;
        while(i>0){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            i--;
            System.out.println();
        }
    }
}
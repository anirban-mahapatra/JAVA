/*
WRITE A JAVA PROGRAM TO PRINT FOLLOWING PATTERN USING FOR:
****
***
**
*

 */

package question_solution;
import java.util.Scanner;
public class PatternUsingFor2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of * print in a row:- ");
        int n=sc.nextInt();

        for(int i=n;i>0;i--) {
            for (int j =0; j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
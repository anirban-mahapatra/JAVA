/*
WRITE A JAVA PROGRAM TO PRINT FOLLOWING PATTERN USING WHILE:
****
***
**
*

 */

package question_solution;
import java.util.Scanner;
public class PatternUsingWhile{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of * print in a row:- ");
        int n=sc.nextInt();

////      METHOD 1
//        for(int i=0;i<n;i++){
//            for(int j=n-i;j>0;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

////      METHOD 2
//        for(int i=0;i<n;i++) {
//            for (int j =0; j<n-i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

////      METHOD 3
//        for(int i=n;i>0;i--) {
//            for (int j =0; j<i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

////      METHOD 4 - USING WHILE
//        int i=0;
//        while(i<n){
//            int j=0;
//            while(j<n-i){
//                System.out.print("*");
//                j++;
//            }
//            i++;
//            System.out.println();
//        }

////      METHOD 5 - USING WHILE
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
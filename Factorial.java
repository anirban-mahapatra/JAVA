//WRITE A PROGRAM TO FIND THE FACTORIAL OF A GIVER NUMBER USING FOR LOOP.
package question_solution;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:- ");
        int n=sc.nextInt();
        int fac=1;

////      USING FOR
//        for(int i=n;i>0;i--){
//            fac=fac*i;
//        }
//        System.out.println("\nThe factorial of "+n+" is "+fac);

////      USING WHILE
        int j=n;
        int fact=1;
        while(j>0){
            fact=fact*j;
            j--;
        }
        System.out.println("\nThe factorial of "+n+" is "+fact);
    }
}

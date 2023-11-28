//WRITE A PROGRAM TO FIND THE FACTORIAL OF A GIVER NUMBER USING FOR LOOP.

import java.util.Scanner;
public class FactorialUsingFor {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:- ");
        int n=sc.nextInt();
        int fac=1;

//      USING FOR
        for(int i=n;i>0;i--){
            fac=fac*i;
        }
        System.out.println("\nThe factorial of "+n+" is "+fac);
    }
}

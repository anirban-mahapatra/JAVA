//WRITE A JAVA PROGRAM TO SUM FIRST N NUMBER OF EVAN NUMBER USING While.

import java.util.Scanner;
public class SumOfEvenNumberUsingWhile {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of even number:- ");
        int  n=sc.nextInt();


//      USING WHILE LOOP
        int even=0;
        int i=0;
        System.out.print("\nThe even number are:- ");
        while(i<n){
            System.out.print(2*i+"\t");
            even=even+(2*i);
            i++;
        }
        System.out.println("\n\nThe sum of even numbers is= "+even);

    }
}

//WRITE A JAVA PROGRAM TO SUM FIRST N NUMBER OF EVAN NUMBER USING FOR.

import java.util.Scanner;
public class SumOfEvenNumberUsingFor {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of even number:- ");
        int  n=sc.nextInt();

//      USING FOR LOOP
        int sum=0;
        System.out.print("\nThe even number are:- ");
        for(int j=0;j<n;j++){
            System.out.print(2*j+"\t");
            sum+=2*j;
        }
        System.out.println("\n\nThe sum of even number is= "+sum);
    }
}

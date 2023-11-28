//WRITE A JAVA PROGRAM TO PRINT FIRST N NATURAL NUMBER IN REVERSE NUMBER.

import java.util.Scanner;
public class ReverseNaturalNo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of natural number:-");
        int n=sc.nextInt();
        System.out.print("The natural number are:- ");
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}

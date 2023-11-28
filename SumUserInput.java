//Write a program to sum three numbers in Java(user input)

import java.util.Scanner;
public class SumUserInput {
    public static void main(String[] args){
        System.out.println("Enter the three number:-");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The sum of "+a+"+"+b+"+"+c+"= "+(a+b+c));
    }
}

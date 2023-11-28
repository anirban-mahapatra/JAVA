//WRITE A JAVA PROGRAM TO FIND FACTORIAL OF A NUMBER USING ITERATIVE METHOD.

import java.util.*;
public class FactorialUsingIterativeMethod {
    static int fact_it(int num){
        int fact=1;
        if(num==0 || num==1){
            return 1;
        }
        else {
            for (int i = 1; i <= num; i++) {
                fact*=i;
            }
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for factorial:- ");
        int n=sc.nextInt();
        System.out.println("\nThe factorial of "+n+" is "+fact_it(n));
    }
}

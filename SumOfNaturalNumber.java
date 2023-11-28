//WRITE A FUNCTION TO CALCULATE SUM OF FIRST Nth NATURAL NUMBER USING ITERATIVE APPROACH.

import java.util.*;
public class SumOfNaturalNumber {
    static void natural(int n){
        int sum=0;
        System.out.println("The "+n+" number of natural number and their sum is");
        for(int i=1;i<=n;i++){
            System.out.print(i);
            sum+=i;
            if(i<n){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the number of natural number: ");
        int n=sc.nextInt();
        natural(n);
    }
}

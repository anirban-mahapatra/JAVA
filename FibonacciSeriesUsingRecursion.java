//WRITE A FUNCTION TO PRINT Nth TERM OF FIBONACCI SERIES USING RECURSION.
package question_solution;
import java.util.*;
public class FibonacciSeriesUsingRecursion {
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of term of fibonacci series: ");
        int n=sc.nextInt();
        System.out.println("\nThe nth term of fibonacci series is "+fib(n));
    }
}

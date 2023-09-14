//WRITE A RECURSIVE FUNCTION TO CALCULATE SUM OF FIRST Nth NATURAL NUMBER.
package question_solution;
import java.util.*;
public class SumOfNaturalNumberUsingRecursion {
    static int natural(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + natural(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of natural number to sum: ");
        int num=sc.nextInt();
        System.out.println("\nThe sum of "+num+"th natural number is "+natural(num));
    }
}

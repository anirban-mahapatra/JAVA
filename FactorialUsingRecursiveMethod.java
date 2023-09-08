//WRITE A JAVA PROGRAM TO COMPUTE FACTORIAL OF A NUMBER USING RECURSIVE METHOD.
package question_solution;
import java.util.*;
public class FactorialUsingRecursiveMethod {
    static int fact_rec(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            return num*fact_rec(num-1);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for factorial :- ");
        int no=sc.nextInt();
        System.out.println("\nThe factorial of "+no+" is "+fact_rec(no));
    }
}

/*WRITE A PROGRAM USING METHOD TO PRINT THE FOLLOWING PATTERN USING RECURSION
 *
 **
 ***
 ****
 *****
 */
package question_solution;
import java.util.*;
public class PatternUsingRecursion {
    static int pattern(int n,int i,int j){
        if(n==0){
//            System.out.println("*");
            return 1;
        }
        else if(i==1){
            System.out.println("*");
            return pattern(n-1,j+1,j+1);
        }
        else{
            System.out.print("*");
            return pattern(n,i-1,j);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int n=sc.nextInt();
        pattern(n,1,1);
    }
}

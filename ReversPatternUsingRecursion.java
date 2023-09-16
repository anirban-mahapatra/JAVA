/*WRITE A PROGRAM USING METHOD TO PRINT THE FOLLOWING PATTERN USING RECURSION.
 *****
 ****
 ***
 **
 *
 */
package question_solution;
import java.util.*;
public class ReversPatternUsingRecursion {
    static int pattern(int r,int i){
        if(r==0){
            return 1;
        }
        else if(r==i){
            System.out.println("*");
            return pattern(r-1,1);
        }
        else{
            System.out.print("*");
            return pattern(r,i+1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int r=sc.nextInt();
        pattern(r,1);
    }
}

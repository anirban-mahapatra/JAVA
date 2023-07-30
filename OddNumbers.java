//WRITE A JAVA PROGRAM TO PRINT FIRST N ODD NUMBER USING A FOR LOOP.
package question_solution;
import java.util.Scanner;
public class OddNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of odd number you want to print:-");
        int n=sc.nextInt();
        System.out.print("The odd numbers are:-");
        for(int i=0;i<n;i++){
            System.out.println((2*i+1)+"\t");
        }
    }
}

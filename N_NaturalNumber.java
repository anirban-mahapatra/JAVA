//WRITE A PROGRAM TO PRINT N NUMBER OF NATURAL NUMBERS USING DO WHILE.
package question_solution;
import java.util.Scanner;
public class N_NaturalNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of natural number:- ");
        int n=sc.nextInt();
        int i=1;
        System.out.print("The natural number are:- ");
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}

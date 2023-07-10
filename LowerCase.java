//WRITE A JAVA PROGRAM TO CONVERT A STRING TO LOWER CASE
package question_solution;
import java.util.Scanner;
public class LowerCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string:- ");
        String a=sc.nextLine();
        System.out.println("\n"+a.toLowerCase());
    }
}

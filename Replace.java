//WRITE A JAVA PROGRAM TO REPLACE SPACE WITH UNDERSCORE
package question_solution;
import java.util.Scanner;
public class Replace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a strings:- ");
        String a=sc.nextLine();
        System.out.println("\n"+a.replace(" ","_"));
    }
}

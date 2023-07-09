//Write a Java program to detect whether a number entered by the user is integer or not
package question_solution;
import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Press any key:-");
        System.out.println(sc.hasNextInt());
    }

}

//Write a program to calculate CGPA using marks of three subjects (out of 100)
package question_solution;
import java.util.Scanner;
public class CGPA_Calculate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three subjects marks(out of 100):-");
        float sub1=sc.nextInt();
        float sub2=sc.nextInt();
        float sub3=sc.nextInt();
        System.out.println("The CGPA of the three subject= "+((sub1+sub2+sub3)/(3*10)));
    }
}

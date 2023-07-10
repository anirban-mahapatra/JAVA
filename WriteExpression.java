//WRITE THE FOLLOWING EXPRESSION IN JAVA PROGRAM:- (V^2 - U^2)/2AS
package question_solution;
import java.util.Scanner;
public class WriteExpression {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of v , u , a and s:- ");
        float v=sc.nextFloat();
        float u=sc.nextFloat();
        float a=sc.nextFloat();
        float s=sc.nextFloat();
        System.out.println("The value of v^2 - u^2 / 2as="+(((v*v)-(u*u))/(2*a*s)));
    }
}

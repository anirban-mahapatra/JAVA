//WRITE THE FOLLOWING EXPRESSION
//1) [X-Y/2]  2) [B^2-4AC/2A] 3) [V^2-U^2] 4) [A*B-D]

import java.util.Scanner;
public class EvaluateExpression {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);

        // 1) [X-Y/2]
        System.out.print("Enter the value of x and y to evaluate (x-y/2):- ");
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        System.out.println("The value of (x-y/2)="+((x-y)/2));

        // 2) [B^2-4AC/2A]
        System.out.print("Enter the value of b , a and c to evaluate (B^2-4AC/2A):- ");
        float b=sc.nextFloat();
        float a=sc.nextFloat();
        float c=sc.nextFloat();
        System.out.println("The value of (B^2-4AC/2A)="+(((b*b)-(4*a*c))/(2*a)));

        // 3) [V^2-U^2]
        System.out.print("Enter the value of v and u to evaluate (V^2-U^2):- ");
        float v=sc.nextFloat();
        float u=sc.nextFloat();
        System.out.println("The value of (V^2-U^2)="+((v*v)-(u*u)));

        // 4) [F*D-E]
        System.out.print("Enter the value of f , d and e to evaluate (F*D-E):- ");
        float f=sc.nextFloat();
        float d=sc.nextFloat();
        float e=sc.nextFloat();
        System.out.println("The value of (F*D-E)="+((f*(d-e))));

    }
}

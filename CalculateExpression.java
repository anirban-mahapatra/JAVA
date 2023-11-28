//CALCULATE X=++Y*8

import java.util.Scanner;
public class CalculateExpression {
    public static void main(String[] arg){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the value of y:-");
     int y=sc.nextInt();
     System.out.println("x="+(++y *8));
    }
}

//USE COMPARISON OPERATOR TO FIND WHETHER A GIVEN NUMBER IS GRATER THEN USER ENTERED NUMBER OR NOT

import java.util.Scanner;
public class GraterOrNot {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int b=10;
        System.out.print("Enter a number:-");
        int a=sc.nextInt();
        System.out.println(a+" is grater then "+b+"\t\t"+(a>10));
    }

}

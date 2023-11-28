//WRITE A PROGRAM TO PRINT MULTIPLICATION TABLE OF A GIVER NUMBER OF N

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the multiplication table number:- ");
        int mul=sc.nextInt();
        System.out.println("\nThe multiplication table of "+mul+" is:-");
        for(int i=1;i<=10;i++){
            System.out.println(mul+" * "+i+" = "+(mul*i));
        }
    }
}

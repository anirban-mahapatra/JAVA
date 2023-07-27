//WRITE A JAVA PROGRAM TO FIND WHETHER A YEAR IS LEAP YEAR OR NOT.
package question_solution;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:-");
        int ye=sc.nextInt();
        if((ye%100==0 && ye%400==0)||(ye%100!=0 && ye%4==0)) {
                System.out.println("\n" + ye + " is a leap year.");
            }
        else{
            System.out.println("\n"+ye+" is not a leap year.");
        }
    }
}

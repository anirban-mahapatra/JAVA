/*
WRITE A PROGRAM TO FIND OUT WHETHER A STUDENT PASS OR FAIL.
 IF IT IS REQUIRED TOTAL 40% AND AT LAST 33% IN EACH SUBJECT TO PASS.
 ASSUMED 3 SUBJECT AND TAKE MASK AS AN INPUT FROM USER.
*/

package question_solution;
import java.util.Scanner;
public class PassFail {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 subject musk(out of 100):-");
        float sub1=sc.nextFloat();
        float sub2=sc.nextFloat();
        float sub3=sc.nextFloat();
        float total=((sub1+sub2+sub3)/3.0f);
        if(total>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("\nYou musk is\nSUBJECT 1 = "+sub1+"%\nSUBJECT 2 = "+sub2+"%\nSUBJECT 3 = "+sub3+"%\n\n" +
                    "TOTAL PERCENTAGE = "+total+"%\n\nCongratulation,You pass in the exam.");
        }
        else{
            System.out.println("You musk is\nSUBJECT 1 = "+sub1+"%\nSUBJECT 2 = "+sub2+"%\nSUBJECT 3 = "+sub3+"%\n\n" +
                    "TOTAL PERCENTAGE = "+total+"%\n\nSorry,You fail in the exam.\nPlease try again");
        }
    }

}

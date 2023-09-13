//WRITE A JAVA METHOD TO PRINT MULTIPLICATION TABLE OF A NUMBER N
package question_solution;
import java.util.*;
public class MultiplicationTableUsingMethod {
    static void multi(int n){
        for(int i=0;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the number for multiplication:- ");
          int n=sc.nextInt();
          multi(n);
    }
}

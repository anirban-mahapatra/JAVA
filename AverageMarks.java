//CALCULATE AVERAGE MARKS OF AN ARRAY CONTAINING MARKS OF ALL STUDENT IN PHYSIC USING FOR EACH LOOP
package question_solution;
import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float []marks=new float[10];
        System.out.print("Enter the number of student:- ");
        int st=sc.nextInt();
        System.out.println("Enter the marks of all student in physic:- ");
        for(int i=0;i<st;i++){
            marks[i]=sc.nextFloat();
        }
        float sum=0;
        for(float element:marks){
            sum+=element;
        }
        System.out.println("The average marks of all student in physic is "+(sum/st));
    }
}

//Write a Program to calculate percentage of a given student in board exam.(5 Subjects)(Marks are out of 100).

import java.util.Scanner;
public class CalculatePercentage {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total marks:-");
        int tot=sc.nextInt();
        System.out.print("Enter the first subject marks:-");
        int sub1=sc.nextInt();
        System.out.print("Enter the second subject marks:-");
        int sub2=sc.nextInt();
        System.out.print("Enter the third subject marks:-");
        int sub3=sc.nextInt();
        System.out.print("Enter the forth subject marks:-");
        int sub4=sc.nextInt();
        System.out.print("Enter the fifth subject marks:-");
        int sub5=sc.nextInt();
        float t=5*tot;
        float persent=(((sub1+sub2+sub3+sub4+sub5)/t)*100);
        System.out.print("The percentage of the student =");
        System.out.print(persent);
        System.out.println("%");
    }
}

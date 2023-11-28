//WRITE A JAVA PROGRAM TO DETECT DOUBLE AND TRIPLE SPACES IN A STRING

import java.util.Scanner;
public class SpacesDetect {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string with double and triple spaces:-");
        String a=sc.nextLine();
        System.out.println(a.length());
        System.out.println("Double spaces in index no:- "+a.indexOf("  "));
        System.out.println("Triple spaces in index no:- "+a.indexOf("   "));
    }
}

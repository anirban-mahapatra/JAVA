//Write a Java program to convert Kilometers to miles
package question_solution;
import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in kilometers:-");
        float km=sc.nextFloat();
        System.out.println(km+" km = "+(km*0.621371)+" Mils");
    }
}

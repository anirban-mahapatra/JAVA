//WRITE A FUNCTION TO CONVERT CELSIUS TEMPERATURE INTO FAHRENHEIT.
package question_solution;
import java.util.*;
public class TemperatureUsingMethod {
    static void temp(float c){
        float far=c*((float) 9/5)+32;
        System.out.printf("%f°C = %.2f°F",c,far);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in celsius(°C): ");
        float cel=sc.nextInt();
        temp(cel);
    }
}

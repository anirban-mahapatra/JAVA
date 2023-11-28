/*
CALCULATE INCOME TAX PAID BY AN EMPLOYEE TO THE GOVERNMENT AS PER MENTIONED BELOW:

    INCOME          TAX PERCENTAGE
   2.5L - 5.0L             5%
   5.0L - 10.0L            20%
   ABOVE 10.0L             30%

NOTE THAT THERE IS NO TAX BELOW 2.5L.
 */

import java.util.Scanner;
public class TexCalculate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float tax=0;
        System.out.print("Enter your salary:-");
        float sa=sc.nextFloat();
        if(sa<=250000) {
            tax=tax+0;
        }
        else if(sa>250000 && sa<=500000){
                tax=tax+ 0.05f *(sa-250000);
        }
        else if(sa>500000&& sa<=1000000){
            tax=tax+ 0.05f *(500000-250000);
            tax=tax + 0.2f *(sa-500000);
        }
        else if(sa>1000000){
            tax= tax+ 0.05f *(500000-250000);
            tax= tax + 0.2f *(1000000-500000);
            tax= tax + 0.3f *(sa-1000000);
        }
        System.out.println("\nYou have to pay "+tax+" rupees as tax");
    }
}

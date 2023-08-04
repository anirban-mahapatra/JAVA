//WRITE A JAVA PROGRAM TO CREATE AN ARRAY OF FLOAT AND CALCULATE THEIR SUM.
package question_solution;
import java.util.Scanner;
public class FloatArraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float []arr=new float[10];
        System.out.print("Enter the number of float element:-");
        int n=sc.nextInt();
        System.out.println("Enter the elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
        }
        float sum=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
        }
        System.out.print("Sum of ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]);
            if(k<n-1){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);
    }
}

//WRITE A JAVA PROGRAM TO PRINT THE ELEMENT OF AN ARRAY IN REVERSE ORDER
package question_solution;
import java.util.Scanner;
public class PrintArrayReversOrder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        System.out.print("Enter the number of element:- ");
        int n=sc.nextInt();
        System.out.print("Enter the elements:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\nArray in reverse order:-");
        for(int j=n-1;j>=0;j--){
            System.out.print(arr[j]+"\t");
        }
    }
}

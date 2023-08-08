//WRITE A JAVA PROGRAM TO REVERSE AN ARRAY.
package question_solution;
import java.util.Scanner;
public class ReversArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        System.out.print("Enter the element:- ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        int k=n-1;
        int temp=0;
        while(j<n/2){
            temp=arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
            j++;
            k--;
        }
        System.out.println("\nThe revers array is :-");
        for(int l=0;l<n;l++){
            System.out.print(arr[l]+"\t");
        }
    }
}

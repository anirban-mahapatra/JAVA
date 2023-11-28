//WRITE A JAVA PROGRAM TO FOND THE MINIMUM ELEMENT IN ARRAY.

import java.util.Scanner;
public class MinimumInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        System.out.print("Enter the number of element:- ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println("The min value of the array is "+min);
    }
}

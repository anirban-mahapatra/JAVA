//WRITE A JAVA PROGRAM TO FIND THE MAXIMUM ELEMENT IN AN ARRAY.

import java.util.Scanner;
public class MaximumInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        System.out.print("Enter the number of element:- ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int j=0;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("The maximum element in the array is "+max);
    }
}

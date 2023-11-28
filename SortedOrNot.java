//WRITE A JAVA PROGRAM TO FIND WHETHER AN ARRAY IS SORTED OR NOT.

import java.util.Scanner;
public class SortedOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        System.out.print("Enter the number of element:- ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int flag=0;
        for(int j=1;j<n;j++){
            if(max<arr[j]){
                max=arr[j];
            }
            else{
                System.out.println("\nThe array is not sorted.");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("\nThe array is sorted.");
        }
    }
}

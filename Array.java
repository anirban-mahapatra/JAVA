//WRITE A JAVA PROGRAM TO PRINT A ARRAY

import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        System.out.print("Enter the number of element:- ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:- ");
        for(int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+"\t");
        }
    }
}

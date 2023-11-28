//WRITE A PROGRAM TO FIND OUT WHETHER A GIVEN INTEGER NUMBER PRESENT IN AN ARRAY OR NOT.

import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        System.out.print("Enter the number of element:-");
        int n=sc.nextInt();
        System.out.println("Enter the element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the search element:- ");
        int se=sc.nextInt();
        int flag=0;
        for(int j=0;j<n;j++){
            if(arr[j]==se){
                System.out.println("\n"+se+" is present in index no "+j+" in the array");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("\n"+se+" is not present in the array");
        }
    }

}

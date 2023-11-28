//WRITE A JAVA PROGRAM TO ADD TWO MATRICES.

import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr1=new int[10][10];
        int [][]arr2=new int[10][10];
        System.out.print("Enter the number of row:- ");
        int ro=sc.nextInt();
        System.out.print("Enter the column:- ");
        int co=sc.nextInt();
        for(int i=0;i<ro;i++) {
            for(int j=0;j<co;j++){
                System.out.print("Enter the element for first matrices in position "+i+j+" :-");
                arr1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int k=0;k<ro;k++){
            for(int l=0;l<co;l++){
                System.out.print("Enter the element for second matrices in position "+k+l+" :-");
                arr2[k][l]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The sum of matrices is:- ");
        for(int m=0;m<ro;m++){
            for(int n=0;n<co;n++){
                System.out.print(arr1[m][n]+arr2[m][n]+"\t");
            }
            System.out.println();
        }
    }
}

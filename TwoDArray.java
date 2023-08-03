//WRITE A JAVA PROGRAM TO PRINT A 2D ARRAY
package question_solution;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[10][10];
        System.out.print("Enter the number of row:-");
        int ro=sc.nextInt();
        System.out.print("Enter the number of column:-");
        int co=sc.nextInt();
        for(int i=0;i<ro;i++){
            for(int j=0;j<co;j++) {
                System.out.print("Enter the element for row "+i+" column "+j+" :-");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int k=0;k<ro;k++){
            for(int l=0;l<co;l++){
                System.out.println("Element of row "+k+" column "+l+" :-"+arr[k][l]);
            }
        }
    }
}

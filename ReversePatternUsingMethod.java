/*WRITE A PROGRAM USING METHOD TO PRINT THE FOLLOWING PATTERN
 *****
 ****
 ***
 **
 *
 */

import java.util.*;
public class ReversePatternUsingMethod {
    static void reverse(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int n=sc.nextInt();
        reverse(n);
    }
}

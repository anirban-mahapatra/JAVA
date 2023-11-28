/*WRITE A PROGRAM USING METHOD TO PRINT THE FOLLOWING PATTERN
*
**
***
****
*****
 */

import java.util.*;
public class PatternUsingMethod {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num=sc.nextInt();
        pattern(num);
    }
}

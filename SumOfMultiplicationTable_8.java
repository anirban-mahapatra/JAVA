//WRITE A PROGRAM TO CALCULATE THE SUM OF THE NUMBER OCCURRING MULTIPLICATION TABLE OF 8

public class SumOfMultiplicationTable_8 {
    public static void main(String[]args){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=(8*i);
        }
        System.out.println("The sum of multiplication table of 8 is "+sum);
    }
}

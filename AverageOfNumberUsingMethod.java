//Write a function to find average of a set of number passed as arguments.
package question_solution;

import java.util.Set;

public class AverageOfNumberUsingMethod {
    static float average(int ...arr){
        float res=0;
        int i=0;
        for(int ele:arr){
            res+=ele;
            i++;
        }
        return (res/i);
    }
    public static void main(String[] args){
        System.out.println("Average of numbers = "+average(99,66));
    }
}

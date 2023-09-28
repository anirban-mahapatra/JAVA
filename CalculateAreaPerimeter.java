//CREATE A CLASS SQUARE WITH A METHOD TO INITIALIZE IT'S SIDE ,CALCULATE AREA, PARAMETER ETC.
package question_solution;
import java.util.*;

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class CalculateAreaPerimeter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Square s=new Square();
        System.out.print("Enter the side:- ");
        s.side=sc.nextInt();
        System.out.println("\nSide= "+s.side+"\nArea= "+s.area()+"\nPerimeter= "+s.perimeter());
    }
}

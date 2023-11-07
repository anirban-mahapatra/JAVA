//CREATE A CLASS RECTANGLE WITH A METHOD TO INITIALIZE IT'S SIDE ,CALCULATE AREA, PARAMETER ETC.
package question_solution;
import java.util.*;

class Rectangle{
    float w,l;
    public float area(){
        return w*l;
    }

    public float perimeter(){
        return 2*(l+w);
    }
}

public class CalculateAreaPerimeterOfRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rectangle r=new Rectangle();
        System.out.print("Enter the length: ");
        r.l=sc.nextFloat();
        System.out.print("Enter the width: ");
        r.w=sc.nextFloat();
        System.out.println("\nArea of rectangle = "+r.area()+"\nPerimeter of rectangle = "+r.perimeter());
    }
}

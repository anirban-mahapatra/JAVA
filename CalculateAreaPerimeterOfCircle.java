//CREATE A CLASS CIRCLE WITH A METHOD TO INITIALIZE IT'S SIDE ,CALCULATE AREA, PARAMETER ETC.
package question_solution;
import java.util.*;

class Circle{
    float r;
    float π=3.14159265359f;
    public float Area(){
        return π*r*r;
    }

    public float Perimeter(){
        return 2*π*r;
    }
}

public class CalculateAreaPerimeterOfCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        System.out.print("Enter the radius(r) of the circle:-");
        c.r=sc.nextInt();
        System.out.println("\n Circle Radius = "+c.r+"\n\t\tArea = "+c.Area()+"\n\t\tPerimeter = "+c.Perimeter());
    }
}

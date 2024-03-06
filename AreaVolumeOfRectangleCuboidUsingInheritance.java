//CREATE A CLASS RECTANGLE AND USE INHERITANCE TO CREATE ANOTHER CLASS CUBOID FROM IT.AND CALCULATE AREA AND VOLUME.
import java.util.*;

class Rectangle1{
    int l,w,h;
    Rectangle1(int l,int w,int h){
        this.l=l;
        this.w=w;
        this.h=h;
        areaR();
        volumeR();
    }
    public void areaR(){
        System.out.println("Area of the rectangle = "+(l*w));
    }
    public void volumeR(){
        System.out.println("Volume of the rectangle = "+(l*w*h));
    }
}

class Cuboid extends Rectangle1{
    Cuboid(int l,int b,int h){
        super(l,b,h);
        areaC();
        volumeC();
    }
    public void areaC(){
        System.out.println("Area of the cuboid = "+(2*((l*w)+(w*h)+(l*h))));
    }
    public void volumeC(){
        System.out.println("Volume of the cuboid = "+(l*w*h));
    }
}

public class AreaVolumeOfRectangleCuboidUsingInheritance {
    public static void main(String[] area){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l=sc.nextInt();
        System.out.print("Enter the width: ");
        int w=sc.nextInt();
        System.out.print("Enter the height: ");
        int h=sc.nextInt();
        System.out.println();
        Cuboid c=new Cuboid(l,w,h);
    }
}

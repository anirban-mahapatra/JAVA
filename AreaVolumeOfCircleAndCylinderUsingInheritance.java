//CREATE A CLASS CIRCLE AND USE INHERITANCE TO CREATE ANOTHER CLASS CYLINDER FROM IT.AND CALCULATE AREA AND VOLUME.
import java.util.*;

class Circle1{
    int r;
    double A;
    Circle1(int r){
        this.r=r;
        areaCi();
    }
    public void areaCi(){
        A=Math.PI*r*r;
        System.out.println("Area of circle of radius "+r+" = "+A);
    }
}

class Cylinder1 extends Circle1{
    int h;
    double cya,cyv;
    Cylinder1(int h,int r){
        super(r);
        this.h=h;
        areaCy();
        volumeCy();
    }
    public void areaCy(){
        cya=2*Math.PI*r*(r+h);
        System.out.println("Area of cylinder of radius "+r+" and height "+h+" = "+cya);
    }
    public void volumeCy(){
        cyv=Math.PI*r*r*h;
        System.out.println("Volume of Cylinder radius "+r+" and height "+h+" = "+cyv);
    }
}

public class AreaVolumeOfCircleAndCylinderUsingInheritance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r=sc.nextInt();
        System.out.print("Enter the height: ");
        int h=sc.nextInt();
        System.out.println();
        Circle1 c=new Cylinder1(r,h);
    }
}

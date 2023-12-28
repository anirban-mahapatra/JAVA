/*CREATE A JAVA CLASS CYLINDER AND USE CONSTRUCTOR TO SET THE RADIUS AND HEIGHT. CALCULATE THE SURFACE
AREA AND VOLUME OF THE CYLINDER.*/

import java.util.*;
class Cylinders{
    private float radius;
    private float height;
    public Cylinders(float r,float h){
        radius=r;
        height=h;
    }
    public float getradius(){
        return radius;
    }
    public float getheight(){
        return height;
    }
    public double area(){
        return ((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
    }
    public double volume(){
        return (Math.PI*radius*radius*height);
    }
}

public class CylinderAreaVolumeConstructor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the radius:- ");
        float ra=sc.nextInt();
        System.out.print("Enter the height:- ");
        float he=sc.nextInt();
        Cylinders cy=new Cylinders(ra,he);
        System.out.println("\nRadius= "+cy.getradius()+"\nHeight= "+cy.getheight()+"\nArea of the cylinder= "
                +cy.area()+"(cm²)\nVolume of the cylinder= "+cy.volume()+"(cm³)");
    }
}

/*CREATE A JAVA CLASS CYLINDER AND USE GETTERS AND SETTERS TO SET THE RADIUS AND HEIGHT. CALCULATE THE SURFACE AREA AND
VOLUME OF THE CYLINDER.*/

import java.util.*;
class Cylinder{
    private float r;
    private float h;
    public void setRadius(float radius){
        r=radius;
    }
    public float getRadius(){
        return r;
    }
    public void setHeight(float height){
        h=height;
    }
    public float getHeight(){
        return h;
    }
    public double area(){
        return ((2*Math.PI*r*h)+(2*Math.PI*r*r));
    }
    public double volume(){
        return (Math.PI*r*r*h);
    }
}

public class CylinderAreaVolume {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Cylinder cy=new Cylinder();
        System.out.print("\nEnter the radius value(cm): ");
        float radius=sc.nextFloat();
        System.out.print("Enter the height value(cm): ");
        float height=sc.nextInt();
        cy.setRadius(radius);
        cy.setHeight(height);
        System.out.println("\nRadius= "+cy.getRadius()+"\nHeight= "+cy.getHeight()+"\nArea of the cylinder= "
                +cy.area()+"(cm²)\nVolume of the cylinder= "+cy.volume()+"(cm³)");
    }
}

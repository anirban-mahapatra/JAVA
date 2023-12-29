/*CREATE A JAVA CLASS SPHERE AND USE GETTERS AND SETTERS TO SET THE RADIUS AND HEIGHT. CALCULATE THE SURFACE AREA AND
VOLUME OF THE CYLINDER.*/

import java.util.*;
class Sphere{
    private float r;
    public void setRadius(float radius){
        r=radius;
    }
    public float getRadius(){
        return r;
    }
    public double area(){
        return (4*Math.PI*r*r);
    }
    public double volume(){
        return ((4*Math.PI*r*r*r)/3);
    }
}

public class SphereAreaVolume {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Sphere sp=new Sphere();
        System.out.print("\nEnter Radius(cm):- ");
        float ra=sc.nextFloat();
        sp.setRadius(ra);
        System.out.println("\nRadius= "+sp.getRadius()+"\nArea of the sphere= " +sp.area()+"(cm²)" +
                "\nVolume of the sphere= "+sp.volume()+"(cm³)");
    }
}

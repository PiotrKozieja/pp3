import java.lang.Math;
public class ac10 {
    static void cuboid(double height, double width){
        System.out.println(height*width);
    }
    static void sphere(double r){
        System.out.println(4*Math.PI*r*r);
    }
    static void cone(double l , double r){
        System.out.println(Math.PI*r*r + Math.PI*r*l);
    }
    public static void main(String[]args){
        sphere(5);
    }
}

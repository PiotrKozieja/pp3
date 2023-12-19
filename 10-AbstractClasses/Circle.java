import java.lang.Math;
public class Circle {
    public int a;
    Circle(int a){
        this.a = a;
    }
    public void calc(){
        System.out.println(Math.PI*a*a);
    }
    public static void main(String[] args) {
        new Circle(2).calc();
    }
}

import java.util.Scanner;
public class c1 {
    static float rectangle(float a, float b){
        return a*b;
    }
    public static void main(String[]args){
        Scanner as = new Scanner(System.in);
        System.out.print("Height is: ");
        float a = as.nextFloat();
        Scanner bs= new Scanner(System.in);
        System.out.print("Length is: ");
        float b = bs.nextFloat();
        System.out.println(rectangle(a, b));
    }
}


public class Triangle {
    public int a;
    public int h;
    Triangle(int a, int h){
        this.a = a;
        this.h = h;
    }
    public void calc(){
        System.out.println((double)(a*h)/2);
    }
    public static void main(String[] args) {
        new Triangle(3, 5).calc();
    }
}
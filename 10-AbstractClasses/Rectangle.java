public class Rectangle extends Shape{
    public int a;
    public int b;
    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void calc(){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        new Rectangle(4, 5).calc();
    }
}

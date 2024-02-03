public class f1ex23 {
    public static void spread(double a, double b){
        System.out.printf("%.4f",b-a);
    }
    public static void time(int h, int m){
        System.out.println(String.format("%02d:%02d",h,m));
    }
    public static void main(String[] args) {
        spread(4.59400, 4.6250);
        System.out.println("\n");
        time(6, 4);
    }
}

public class ac1 {
    public static void main(String[] args) {
        int height = 180;
        double inches = height*0.39370;
        double feet = (int)inches/12;
        double restfeet = inches%feet;
        System.out.println(inches+" "+feet+" "+restfeet);
        System.out.println("Your height is: "+(int)feet+" feets and "+(int)(restfeet*10)+" inches");
    }
}
import java.util.Scanner;
public class ac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj predkosc:");
        int speed = scanner.nextInt();
        if(speed>140){      
            System.out.println("Predkosc jest zbyt duza o "+ (speed-140));
        }
        else{
            System.out.println("Its ok");
        }
    }
}

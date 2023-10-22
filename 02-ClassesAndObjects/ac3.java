import java.util.Scanner;
public class ac3{
    public static void main(String[]args){
        Scanner buys = new Scanner(System.in);
        System.out.print("Podaj cene kupna: ");
        float buy = buys.nextFloat();
        Scanner sells = new Scanner(System.in);
        System.out.print("Podaj cene sprzedazy: ");
        float sell = sells.nextFloat();
        if(buy<sell){
            System.out.print("Spread is: ");
            System.out.printf("%5.4f%n", (sell-buy));
        }
        else{
            System.out.println("Spread is inpossible4");
        }


    }
}

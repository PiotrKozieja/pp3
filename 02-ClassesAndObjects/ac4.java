import java.util.Scanner;
public class ac4 {
    public static void main(String[]args){
        Scanner hours = new Scanner(System.in);
        System.out.print("What hour is it: ");
        int hour = hours.nextInt();
        Scanner minutess = new Scanner(System.in);
        System.out.print("How many minutes after");
        int minutes = minutess.nextInt();
        System.out.println("Its "+(hour*60+minutes)+" minutes after midnight its equal to "+((hour*60+minutes)*60)+" seconds");
    }
}

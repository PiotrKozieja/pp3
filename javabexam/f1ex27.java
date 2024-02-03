public class f1ex27 {
    static boolean status = false;
    public static void ton(){
        status = true;
    }
    public static void toff(){
        status = false;
    }
    public static void ch(){
        status =! status;
    }
    public static void display(){
        System.out.println(status?"Wlaczona":"Wylaczona");
    }
    public static void main(String[] args) {
        ton();
        display();
        toff();
        display();
        ch();
        display();
    }
}

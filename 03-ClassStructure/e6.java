public class e6 {
    static int year = 2023;
    static int month = 4;
    static int day = 9;
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] months = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};
    static int dayc = 0;



    static String myDate(){
        return "idk";
    }
    public static void days(){
        for (int i = 0; i <month; i++){
            dayc += days[i];
        }
        System.out.println(dayc+day);
    }

    public static void monthName(){
        System.out.println(months[month-1]);
    }

    public static void main(String[]args){
        myDate();
        days();
        monthName();
    }
}



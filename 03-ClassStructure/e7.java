public class e7 {
    static String cinemaName = "CinemaCity";
    String filmTitle;
    int row;
    int seat;
    double price;

    //void show(){
    //    System.out.println("C name is: "+cinemaName);
    //    System.out.println(filmTitle);
    //    System.out.println(row);
    //    System.out.println(seat);
    //    System.out.println(price);
    //}
    static String toString(String filmName,int row,int seat,double price) {
        return "Cinema: " + cinemaName + "\n" +
                "Film Title: " + filmName + "\n" +
                "Row: " + row + "\n" +
                "Seat: " + seat + "\n" +
                "Price: $" + price;
    }

    
public static void main(String[]args){   
    //e7 c1 = new e7();
    //c1.filmTitle = "Once upon in hollywood";
    //c1.row = 2;
    //c1.seat =3;
    //c1.price =24;
    //c1.show();
    //e7 c2 = new e7();
    //c2.filmTitle = "Once upon in hollywood 2";
    //c2.row = 5;
    //c2.seat =2;
    //c2.price =23;
    //c2.show();
    System.out.println(e7.toString("Once upon in hollywood",2,3,5.0));
    
}
}
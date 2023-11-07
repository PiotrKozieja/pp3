public class ac82 {
    static String cinemaName = "CinemaCity";

    static String generateTicketInfo(String filmName, int row, int seat) {
        int price;
        if (row <= 2) {
            price = 10;
        } else {
            price = 25;
        }
        return "Cinema: " + cinemaName + "\n" +
                "Film Title: " + filmName + "\n" +
                "Row: " + row + "\n" +
                "Seat: " + seat + "\n" +
                "Price: $" + price;
    }

    public static void main(String[]args) {
        System.out.println(ac82.generateTicketInfo("Once upon in Hollywood", 3, 3));
    }
}

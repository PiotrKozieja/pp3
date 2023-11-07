public class ex10test {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.name = "Jack";
        dl.surname = "Gadowsky";
        dl.address = "Szpitalna";
        dl.postalc = "39-222";
        dl.city = "Radom";
        dl.drn = 12345678;
        dl.yoi = 1988;
        dl.dlc = "B";


        dl.display();
        dl.toString();

    
    }
}

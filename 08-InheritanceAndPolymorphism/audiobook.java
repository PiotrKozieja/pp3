public class audiobook extends book {
    double abDuartaion;


    public audiobook(String stitle, String sauthor, int year, Publisher publisher, double abDuartaion) {
        super(stitle, sauthor, year, publisher);
        this.abDuartaion = abDuartaion;
    }

    public double getAbDuartaion() {
        return abDuartaion;
    }

    public void setAbDuartaion(double abDuartaion) {
        this.abDuartaion = abDuartaion;
    }
    public void display(){
        System.out.println("Title: "+this.title+"Author: "+this.author+" AB DURATION: "+this.abDuartaion+" Publisher: "+publisher.name);
    }
    
}

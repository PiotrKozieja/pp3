public class f1ex1{
    String name;
    int gnumber;
    int year;
    boolean valid;

    public void ny(){
        year++;
    }
    public void prevy(){
        year--;
    }
    public void display(){
        System.out.println("Name: "+name+" GroupNumbber: "+gnumber+" Year: "+year);
    }
    public void chvalid(){
        System.out.println(valid?"Dziala":"Zjebana");
    }
    public void changev(){
        valid =! valid;
    }

    public static void main(String[] args) {
        f1ex1 s1 = new f1ex1();
        s1.gnumber = 12;
        s1.name = "Piotr";
        s1.year = 2;
        s1.valid = false;

        s1.display();
        s1.ny();
        s1.ny();
        s1.ny();
        s1.display();
        s1.prevy();
        s1.display();
        s1.chvalid();
        s1.changev();
        s1.chvalid();
    }
}

import java.util.ArrayList;

public class ex6test {
    public static void main(String[] args) {
        book b1 = new book("POS","Adamski");
        ebook eb1 = new ebook("Pose", "Adamski", "Ebook");
        audiobook ab1 = new audiobook("abook", "ABAdamski", 60.23);
        publisher p1 
        b1.display();
        eb1.display();
        ab1.display();


        ArrayList<book> lib = new ArrayList<book>();
        lib.add(b1);
        lib.add(eb1);
        lib.add(ab1);

        for(book i: lib){
            i.display();
        }


    }
}

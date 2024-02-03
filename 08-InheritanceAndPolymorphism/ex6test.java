import java.util.ArrayList;

public class ex6test {
    public static void main(String[] args) {
        Publisher p1 = new Publisher("Wydawnictwo","maj");
        book b1 = new book("POS","Adamski",1988,p1);
        ebook eb1 = new ebook("Pose", "Adamski",2000,p1,"Ebook");
        audiobook ab1 = new audiobook("abook", "ABAdamski",2017,p1, 60.23);
        
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

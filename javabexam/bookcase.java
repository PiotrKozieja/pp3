import java.util.ArrayList;

public class bookcase {
    private author authora;
    private book bookt;
    private String name;
    private ArrayList<book> arr = new ArrayList<>();
    public bookcase(String names){
        this.name = names;
    }
    public void add(book b){
        arr.add(b);
    }
    public void remove(book b){
        arr.remove(b);
    }
    public void show(){
        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i).gettitle()+" "+arr.get(i).getauthora().getSurname());
        }
    }
    public static void main(String[] args) {
        author a1 = new author("Mickiewicz");
        author a2 = new author("ZIM");
        book b1 = new book("Pan Tadeusz", a1);
        book b2 = new book("ZIMNO", a2);
        bookcase bc1 = new bookcase("bc1");
        bc1.add(b1);
        bc1.add(b2);
        bc1.show();
    }
}

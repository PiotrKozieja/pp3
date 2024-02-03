public class book {
    private author authora;
    private String title;

    public book(String titles,author authors){
        this.title = titles;
        this.authora = authors;
    }
    public author getauthora(){
        return authora;
    }
    public String autor(){
        return this.authora.getSurname();
    }
    public void show(){
        System.out.println("title:"+title+" author "+this.getauthora().getSurname());
    }
    public String gettitle(){
        return title;
    }
    public static void main(String[] args) {
        author a1 = new author("Mickiewicz");
        author a2 = new author("ZIM");
        book b1 = new book("Pan Tadeusz", a1);
        book b2 = new book("ZIMNO", a2);
        b1.show();
        b2.show();
        System.out.println(b2.autor());
        System.out.println(b1.autor());
    }
}

public class book {
    String title;
    String author;
    public Publisher publisher;

    public book(String stitle, String sauthor){
        this.title = stitle;
        this.author = sauthor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display(){
        System.out.println("Title: "+this.title+"\n"+"Author: "+this.author+"Publsiher: "+this.publisher.name);
    }
    public static void main(String[] args) {
    book b1 = new book("POS","Adamski");
    b1.display();   
    }

}

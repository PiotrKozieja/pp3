public class book {
    String title;
    String author;
    public Publisher publisher;
    int year;

    public book(String stitle, String sauthor, int year, Publisher publisher){
        this.title = stitle;
        this.author = sauthor;
        this.publisher = publisher;
        this.year = year;
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
        System.out.println("Title: "+this.title+"\n"+"Author: "+this.author+"\nPublsiher: "+this.publisher.name);
    }

}

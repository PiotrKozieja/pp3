public class ebook extends book{
    private String filename;

    public ebook(String stitle, String sauthor, String filename) {
        super(stitle, sauthor);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    public void display() {
        System.out.println("Title: "+this.getTitle()+"Author: "+this.getAuthor()+"File: "+this.getFilename());
    }
}

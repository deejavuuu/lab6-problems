package Problem3;

public class Book extends Document{
    String author;
    int nbrPages;
    public Book(String title,String author, int nbrPages){
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }
}

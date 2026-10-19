package Problem3;

public class TextBook extends Book {
    String level;
    public TextBook(String title, String author, int nbrPages, String level){
        super(title,author,nbrPages);
        this.level = level;
    }
    @Override
    public String toString(){
        return "Title :"+ this.title+" Author: "+this.author+ "nbrPages: "+ this.nbrPages+ " Level: "+ this.level;
    }
}

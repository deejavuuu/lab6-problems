package Problem3;

public class Novel extends Book{
    double price;
    public Novel(String title, String author, int nbrPages, double price){
        super(title,author,nbrPages);
        this.price = price;
    }
    @Override
    public String toString(){
        return "Title :"+ this.title+" Author: "+this.author+ "nbrPages: "+ this.nbrPages+ " Price: "+ this.price;
    }
}

package Problem3;

public class Dictionary extends Document{
    String language;
    public Dictionary(String title, String language){
        super(title);
        this.language = language;

    }
    public String toString(){
        return "Title :"+ this.title+ " Language: "+ this.language;
    }
}

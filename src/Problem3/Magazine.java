package Problem3;

public class Magazine extends Document{
    String month;
    int year;
    public Magazine(String title, String month, int year){
        super(title);
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return "Title :"+ this.title+ " Month: "+ this.month+" Year: "+ this.year;
    }
}

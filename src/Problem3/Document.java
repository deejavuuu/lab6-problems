package Problem3;

public class Document {

    static int numRec = 0;
    int index;
    public String title;
    public Document(String name){
        this.title = name;
        this.index = numRec;
        numRec++;
    }
}

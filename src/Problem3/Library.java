package Problem3;
import java.util.ArrayList;
public class Library {
    ArrayList<Document> documents;
    int capacity;
    public Library(int capacity){
        this.documents = new ArrayList<Document>(capacity);
        this.capacity = capacity;
    }
    public void displayDocuments(){
        for(var i: documents){
            System.out.println(i);
        }

    }
    public boolean add(Document d){
        if(documents.size()< this.capacity){
            documents.add(d);
            return true;
        }
        return false;
    }

    public boolean delete(Document d){
        if(documents.contains(d)){
            documents.remove(d);
            return true;
        }
        return false;
    }

    Document document(int numRec){
        return this.documents.get(numRec);
    }

    public void displayAuthors(){
        for(var i:documents){
            if(i instanceof Book){
                System.out.println(((Book) i).author);
            }
        }
    }


}

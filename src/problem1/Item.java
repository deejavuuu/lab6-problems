package problem1;

public class Item {
    String name;
    double price;
    int quantity;

    public Item(String name, double price, int quantity){
        this.name= name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return ("Name: "+this.name+" Price: "+this.price+" quantity: "+this.quantity+"\n---------------------");
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getPrice(){
        return this.price;
    }

}

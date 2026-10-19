package Problem2;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Double> transactions;

    public Customer(String name){
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }
}

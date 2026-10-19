package Problem2;
import java.util.ArrayList;
import java.util.List;
public class Bank {
    String name;
    ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    public void addCustomer(Customer customer){
        if(!this.customers.contains(customer)){
            this.customers.add(customer);
        }
    }
    public void addTransactions(Double value, String name){
        for(var i: customers){
            if(i.name.equals(name)){
                i.transactions.add(value);
            }
        }
    }

    public String statement(Customer customer){
        StringBuilder res = new StringBuilder();
        res.append("Customer Name: ").append(customer.name).append("\nTransactions: [");
        for(var i: customer.transactions){
            res.append(i).append("MAD,");
        }
        res.delete(res.length()-1,res.length()).append("]");
        return res.toString();
    }


}

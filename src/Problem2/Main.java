package Problem2;

public class Main {
    public static void main(String[] args){
        Customer c1 = new Customer("Rachid");
        Customer c2 = new Customer("Mohammed");
        Customer c3 = new Customer("Nabila");

        Bank b = new Bank("World Bank");
        b.addCustomer(c1);
        b.addCustomer(c2);
        b.addCustomer(c3);

        b.addTransactions((double) 1000,"Rachid");
        b.addTransactions((double) 2000,"Rachid");
        b.addTransactions((double) -1000,"Rachid");

        b.statement(c1);



    }
}

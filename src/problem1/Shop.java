package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            double totalPrice = 0;
            // *** create a new item and add it to the cart
            cart.add(new Item(itemName,itemPrice, quantity));
            // *** print the contents of the cart object using println
            for(var i:cart){
                System.out.println(i);
                totalPrice+=i.getPrice()*i.getQuantity();
            }
            System.out.printf("Total Price: %.2f\n",totalPrice);
            System.out.print("Continue shopping (y/n)? ");
            scan.nextLine();
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}

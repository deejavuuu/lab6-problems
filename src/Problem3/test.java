package Problem3;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the capacity of your library: ");
        int n = input.nextInt();
        Library lib = new Library(n);
        Document d1 = new Book("Book1","author ",300);

    }
}

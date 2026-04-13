package chatgptpractise;

import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;

    public Book() {
        // LINE-1: initialize title as "Unknown"
        title = "Unknown";
    }

    // LINE-2: parameterized constructor
    public Book(String t, String a, double p){
        title = t;
        author = a;
        price = p;

    }

    // LINE-3: method copyAuthor(Book b)
    public void copyAuthor(Book b){
        this.author = b.author;
    }

    // LINE-4: method displayDetails()
    public void displayDetails(){
        System.out.println("title: " +title);
        System.out.println("author: " +author);
        System.out.println("price: " +price);
    }
}

public class twoqfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();

        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();

        Book b2 = new Book(title, author, price);

        b1.copyAuthor(b2);

        b1.displayDetails();
    }
}

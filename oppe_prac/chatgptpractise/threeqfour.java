/*
Consider the following Java program.
Fill in the missing parts as instructed.
*/

package chatgptpractise;
import java.util.*;
class Product {
    public double price() {
        return 0;
    }
    public double finalPrice() {
        return 0;
    }
}

class Book extends Product {
    private double cost;

    // implement constructor
    public Book(double c){
        this.cost = c;
    }

    // override price() → return cost
    @Override
    public double price(){
        return cost;
    }
}

class DiscountedBook extends Book {
    private double discount;
    private double cost;
    // implement constructor
    public DiscountedBook(double c, double d){
        super(c);
        this.cost = c;
        this.discount = d;
    }
    // finalPrice = cost - discount

    // override finalPrice()
    @Override
    public double finalPrice(){
        return cost - discount;
    }
}

public class threeqfour {
        public static void caller(Product p) {
        // if p is Book → print price
        if (p instanceof Book){
            System.out.println(p.price());
        }
        // if p is DiscountedBook → print finalPrice
        if (p instanceof DiscountedBook){
            System.out.println(p.finalPrice());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cost = sc.nextDouble();
        double discount = sc.nextDouble();

        caller(new Book(cost));
        caller(new DiscountedBook(cost, discount));
    }
}

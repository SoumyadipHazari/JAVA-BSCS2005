/*
Complete the class so that:

Default brand = "Generic"
Parameterized constructor sets brand and RAM
A method copies RAM from another laptop
A method displays configuration
*/

package chatgptpractise;

import java.util.Scanner;
class Laptop {
    String brand;
    int ram;

    public Laptop() {
        // LINE-1: initialize brand = "Generic"
        brand = "Generic";
    }

    // LINE-2: parameterized constructor
    public Laptop(String b, int r){
        brand = b;
        ram = r;
    }

    // LINE-3: method copyRam(Laptop l)
    public void copyRam(Laptop l){
        this.ram = l.ram;
    }

    // LINE-4: method display()
    public void display(){
        System.out.println("Brand: " +brand);
        System.out.println("ram: " +ram);
    }
}

public class twoqsix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Laptop l1 = new Laptop();

        String brand = sc.nextLine();
        int ram = sc.nextInt();

        Laptop l2 = new Laptop(brand, ram);

        l1.copyRam(l2);

        l1.display();
    }
}

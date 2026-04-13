/*
Complete the class so that:

Default balance = 0
Parameterized constructor sets name and balance
A method copies balance from another account
A method prints account details
*/

package chatgptpractise;

import java.util.Scanner;

import java.util.Scanner;

class Account {
    String name;
    double balance;

    public Account() {
        // LINE-1: initialize balance = 0
        balance = 0;
    }

    // LINE-2: parameterized constructor
    public Account(String n, double b){
        name = n;
        balance = b;
    }

    // LINE-3: method copyBalance(Account a)
    public void copyBalance(Account a){
        this.balance = a.balance;
    }

    // LINE-4: method display()
    public void display(){
        System.out.println("name: " +name);
        System.out.println("balance: " +balance);
    }
}

public class twoqfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account a1 = new Account();

        String name = sc.nextLine();
        double bal = sc.nextDouble();

        Account a2 = new Account(name, bal);

        a1.copyBalance(a2);

        a1.display();
    }
}

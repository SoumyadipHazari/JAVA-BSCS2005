/*🔹 Question 1: Wallet System

Create a Wallet class with the following:

Instance variables
walletId
ownerName
balance
final variable: minBalance = 50
Private method
checkLimit(amount)
→ returns false if balance - amount < minBalance, else true
Public methods
showBalance() → prints balance
addMoney(amount) → increases balance
spend(amount)
→ calls checkLimit(amount)
→ if true, deduct amount
→ else print "Insufficient balance"
*/

package chatgptpractise;
import java.util.*;

class Wallet {
    int walletId;
    String ownerName;
    int balance;
    final int minBalance = 50;

    private boolean checkLimit(int amount) {
        // implement
        if (balance - amount < minBalance){
            return true;
        }else{
            return false;
        }
    }

    // constructor
    public Wallet(int walletId, String ownerName, int balance){
        this.walletId = walletId;
        this.ownerName = ownerName;
        this.balance = balance; 
    }

    // showBalance()
    public void showBalance(){
        System.out.println(balance);
    }

    // addMoney(amount)
    public void addMoney(int amount){
        balance = balance + amount;
    }

    // spend(amount)
    public void spend(int amount){
        balance = balance - amount;
    }
}
public class threeqfive {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int add = sc.nextInt();
        int spend = sc.nextInt();

        Wallet w = new Wallet(101, "Amit", 500);

        w.addMoney(add);
        w.showBalance();

        w.spend(spend);
        w.showBalance();
    }
}

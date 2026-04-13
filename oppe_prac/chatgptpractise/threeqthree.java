/*
Consider the following Java program.
Complete the missing parts as instructed in the comments.
*/

package chatgptpractise;
import java.util.*;

class Animal {
    public String sound() {
        return "unknown";
    }
    public int legs() {
        return 0;
    }
}

class Dog extends Animal {
    private int legs;

    // implement constructor
    public Dog( int l){
        this.legs = l;
    }

    // override sound() → return "bark"
    @Override
    public String sound(){
        return "bark";
    }

    // override legs() → return number of legs
    @Override
    public int legs(){
        return 4;
    }
}

class Bird extends Animal {
    private int wings;

    // implement constructor
    public Bird(int w){
        this.wings = w;
    }

    // override sound() → return "chirp"
    @Override
    public String sound(){
        return "chirp";
    }

    // override legs() → return 2
    @Override
    public int legs(){
        return 2;
    }
}


public class threeqthree {
    public static void caller(Animal a) {
        // if a is Dog → print sound
        if(a instanceof Dog){
            System.out.println(a.sound());
        }
        // if a is Bird → print legs
        if(a instanceof Bird){
            System.out.println(a.legs());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dogLegs = sc.nextInt();
        int wings = sc.nextInt();

        caller(new Dog(dogLegs));
        caller(new Bird(wings));
    }   
}

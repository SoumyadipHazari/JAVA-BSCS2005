/*
Question 2: Vehicle & ElectricVehicle

Consider the following Java program.
Fill in the missing parts to satisfy the given structure.
*/


package chatgptpractise;
import java.util.*;
class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("brand : " + brand);
        System.out.println("speed : " + speed);
    }
}
class Car extends Vehicle {
    private double price;

    // implement constructor
    public Car(String b, int s, double p){
        super(b,s);
        this.price = p;
        
    }

    // override display method
    @Override
    public void display(){
        super.display();
        System.out.println("price: " +price);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;

    // implement constructor so that price = batteryCapacity * 500
    public ElectricCar(String b,int s, int bc){
        super(b,s,bc*500);
        this.batteryCapacity = bc;
    }
}
public class threeqtwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b1 = sc.nextLine();
        String b2 = sc.nextLine();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        double p = sc.nextDouble();
        int bc = sc.nextInt();

        Car[] cars = new Car[2];

        cars[0] = new Car(b1, s1, p);
        cars[1] = new ElectricCar(b2, s2, bc);

        for (Car c : cars)
            c.display();
    }
}

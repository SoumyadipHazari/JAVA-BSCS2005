/*
Complete the class such that:

Parameterized constructor initializes all fields
Copy constructor performs deep copy of array
A mutator modifies original object
Display method prints details
*/

package chatgptpractise;

import java.util.Scanner;

class Car {
    String model;
    String brand;
    String features[];

    // LINE-1: parameterized constructor
    public Car(String m, String b, String f[]){
        this.model = m;
        this.brand = b;
        this.features = new String[f.length];
        for (int i = 0; i < f.length; i++){
            this.features[i] = f[i];
        }
    }
    // LINE-2: copy constructor (deep copy)
    public Car(Car c){
        this.model = c.model;
        this.brand = c.brand;
        this.features = new String[c.features.length];
        for(int i = 0; i < c.features.length; i++){
            this.features[i] = c.features[i];
        }
    }

    // LINE-3: mutator()
    public void mutator(){
        this.brand = "Updated" + brand;
        this.features[this.features.length -1] = null;
    }
    // change brand to "Updated_" + brand
    // set last feature = null

    // LINE-4: display()
    public void display(){
        System.out.println("model: "+model);
        System.out.println("brand: "+brand);
        System.out.println("features; ");
        for (int i = 0; i< features.length; i++){
            System.out.println(features[i] +";");
        }
    }
}

public class twoqeight {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] features = {"AC", "GPS", "Sunroof"};

        String model = sc.nextLine();
        String brand = sc.nextLine();

        Car c1 = new Car(model, brand, features);
        Car c2 = new Car(c1);

        c1.mutator();

        c2.display();
    }
}

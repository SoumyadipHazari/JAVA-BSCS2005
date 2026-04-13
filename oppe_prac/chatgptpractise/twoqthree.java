/*
Given the radius of a circle, compute and print the area.
*/
package chatgptpractise;

import java.util.*;

class Circle {
    double radius;

    // LINE-1: write method setRadius(double r)
    public void setRadius(double r){
        this.radius = r;
    }

    // LINE-2: write method area()
    double area(){
        return 3.14*radius*radius;
    }
    // return area using formula: π * r * r
}

public class twoqthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        Circle c = new Circle();
        c.setRadius(r);

        System.out.printf("%.2f", c.area());
    }
}
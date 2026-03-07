/*Given as input two integers n_1,n_2 and two double values d_1,d_2 complete the Java code to form two complex numbers c_1 and c_2, as described below, and print their sum.

    The real parts of c_1 and c_2 are n_1 and d_1 respectively, whereas their imaginary parts are n_2 and d_2, respectively.
    Define a generic class ComplexNum with the following members.
        Instance variables r and i
        A constructor to initialize r and i	
        A method add()to return the sum of the two instances of generic type ComplexNum
        A method that overrides the toString() method in the Object class so that the format of the output is in accordance with those in the test cases. */

package Week_5;

import java.util.*;

// add your code for ComplexNum here 

class ComplexNum<T extends Number> {
    T r;
    T i;

    // Constructor
    ComplexNum(T r, T i) {
        this.r = r;
        this.i = i;
    }

    // Method to add two complex numbers
    public ComplexNum<Double> add(ComplexNum<? extends Number> other) {
        double real = this.r.doubleValue() + other.r.doubleValue();
        double imag = this.i.doubleValue() + other.i.doubleValue();
        return new ComplexNum<Double>(real, imag);
    }

    // Override toString()
    public String toString() {
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}

public class grpa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}

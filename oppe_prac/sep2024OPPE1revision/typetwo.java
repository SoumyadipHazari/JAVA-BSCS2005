/*
You are given two integers as input to form an object (r1) of typeRectangle and two double
values as input to form an object r2 of type Rectangle. Complete the Java code to print
the larger area among the areas of r1 and r2.

• Define a generic class Rectangle with the following members.
– Instance variables length and breadth
– Constructor to initialize the instance variables
– Method area( ) that returns the area of a rectangle object
– Method compareArea( ) that returns the larger area among that of r1 and r2.
• Class Test has method main( ), and takes two integers and two double values as input
to create two objects of Rectangle type. It then invokes the necessary methods and
prints large area.
*/

package sep2024OPPE1revision;
import java.util.*;
class Rectangle<T extends Number>{
    private T length;
    private T breadth;
    public Rectangle(T len, T bre){
        length = len;
        breadth = bre;
    }
//define method public double area() here
public double area(){
    return length.doubleValue() * breadth.doubleValue();
}
//define method compareArea() here
public double compareArea(Rectangle<?> rec){
    if(this.area() > rec.area())
        return this.area();
    else
        return rec.area();
}
}
public class typetwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle<Integer> r1 = new Rectangle<>(sc.nextInt(), sc.nextInt());
        Rectangle<Double> r2 = new Rectangle<>(sc.nextDouble(), sc.nextDouble());
        double large_area = r1.compareArea(r2);
        System.out.println(large_area);
    }
}

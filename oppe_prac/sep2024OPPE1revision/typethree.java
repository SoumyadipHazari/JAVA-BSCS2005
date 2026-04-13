/*
Problem Statement
Complete the Java code that uses the concept of inheritance to demonstrate dynamic method
dispatching.
Class WaterBody has the following members:
• Private instance variable name
• Constructor to initialize name
• Accessor method for name
• Method display to display the text: Inside an anonymous body of water
Classes River and Lake should be defined in such a way that any object of River or Lake can
be assigned to a reference variable of type WaterBody. See the main method to understand
the context.
• For an object of River, method display should print the message Inside river
followed by the name of the river.
• For an object of Lake, method display should print the message Inside lake fol-
lowed by the name of the lake.
What you have to do:
• Define an accessor method for name inside class WaterBody
• Define method display inside class WaterBody
• Define classes River and Lake
*/

package sep2024OPPE1revision;

import java.util.*;
class WaterBody{
    private String name;
    public WaterBody(String n){
        name = n;
    }
    //define method display
    public void display(){
        System.out.println("Inside an anonymous body of water");
    }
    //define accessor method
    public String getName(){
        return name;
    }
}
    //define class river
class River extends WaterBody{
    public River(String n){
        super(n);
    }
    public void display(){
        System.out.println("Inside river" +getName());
    }
}
    //define class lake
class Lake extends WaterBody{
    public Lake(String n){
        super(n);
    }
    public void display(){
        System.out.println("Inside lake" +getName());
    }
}
public class typethree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WaterBody[] wBodies= new WaterBody[3];
        wBodies[0] = new WaterBody("");
        wBodies[1] = new River(sc.nextLine());
        wBodies[2] = new Lake(sc.nextLine());

        wBodies[0].display();
        wBodies[1].display();
        wBodies[2].display();
        sc.close();
    }
}

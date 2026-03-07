/*


Consider the following Java program. 
Implement the code as instructed in the comment, such that it satisfies the given test cases.
*/
package Week_3;

import java.util.*;
class Shape{
    public int area() {
        return 0;
    }
    public int volume() {
        return 0;
    }
}

class Rectangle extends Shape{
    private int w, h;
//implement Rectangle class
    public Rectangle(int w, int h){
        this.w = w;
        this.h = h;
    }
    @Override
    public int area(){
        return w * h;
    }
}

class Cube extends Shape{
    private int a;
    //implement Cube class
    public Cube(int a){
        this.a = a;
    }
    @Override
    public int area(){
        return 6 * a * a;
    }
    @Override
    public int volume(){
        return a * a * a;
    }
}

class grpa2{
    private static void caller(Shape s) {
        //check if s is of type Rectangle
        if (s instanceof Rectangle){
            System.out.println(s.area());
        }
        if (s instanceof Cube){
            System.out.println(s.volume());
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a = sc.nextInt();
        caller(new Rectangle(w, h));
        caller(new Cube(a));
    }
}

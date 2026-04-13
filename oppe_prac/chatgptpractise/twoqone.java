/*
You are given marks of a student in 3 subjects. 
Complete the program to calculate and print the average marks.
*/

package chatgptpractise;

import java.util.*;
class Student{
    int m1,m2,m3;
    // write method setmarks (int a, int b, int c)
    public void setMarks(int a,int b,int c){
        this.m1 = a;
        this.m2 = b;
        this.m3 = c;
    }

    // write method average() to return average of marks
    float average(){
        return (m1+m2+m3)/3.0f;
    }
}

public class twoqone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Student s = new Student();
        s.setMarks(a, b, c);
        System.out.println(s.average());
    }
}

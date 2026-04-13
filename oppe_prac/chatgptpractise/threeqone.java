/*
Question 1: Student & ScholarshipStudent

Consider the following Java program.
Complete the missing parts as instructed in the comments.
*/

package chatgptpractise;
import java.util.*;

class Student {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void print() {
        System.out.println("name : " + name);
        System.out.println("roll : " + roll);
    }
}

class CollegeStudent extends Student {
    private double fees;

    // implement constructor
    public CollegeStudent(String n, int r, double f){
        super(n, r);
        this.fees = f;
    }

    // override print method
    @Override
    public void print(){
        super.print();
        System.out.println("fees: " +fees);
    }
}

class ScholarshipStudent extends CollegeStudent {
    private double scholarship;

    // implement constructor so that fees = fees - scholarship
    public ScholarshipStudent(String n, int r,double f, double s){
        super(n,r,f-s);
        this.scholarship = s;
    }
}


public class threeqone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        double f = sc.nextDouble();
        double s = sc.nextDouble();

        CollegeStudent[] arr = new CollegeStudent[2];

        arr[0] = new CollegeStudent(n1, r1, f);
        arr[1] = new ScholarshipStudent(n2, r2, f, s);

        for (CollegeStudent st : arr)
            st.print();
    }
}

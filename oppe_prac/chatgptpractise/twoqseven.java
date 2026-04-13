/*
Complete the class such that:

Parameterized constructor initializes all fields
Copy constructor performs deep copy of array
A mutator modifies original object
Display method prints details
*/
package chatgptpractise;
import java.util.*;

class Student {
    String sid;
    String sname;
    String courses[];

    // LINE-1: parameterized constructor
    public Student(String id, String name, String c[]){
        this.sid = id;
        this.sname = name;
        this.courses = new String[c.length];
        for (int i =0; i < c.length; i++){
            this.courses[i] = c[i];
        }
    }

    // LINE-2: copy constructor (deep copy)
    public Student(Student s){
        this.sid = s.sid;
        this.sname = s.sname;
        this.courses = new String[s.courses.length];
        for (int i = 0; i<s.courses.length; i++){
            this.courses[i] = s.courses[i];
        }
    }

    // LINE-3: mutator()
    public void mutator(){
        this.sname = "Student" + this.sname;
        this.courses[0]= null; 
    }
    // change name to "Student_" + name
    // set first course = null

    // LINE-4: display()
    public void display(){
        System.out.println("id: " +sid);
        System.out.println("name: " +sname);
        System.out.println("projects: ");
        for (int i = 0; i < courses.length; i++){
            System.out.println(courses[i] + ":");
        }
    }
}

public class twoqseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] courses = {"Math", "DSA", "OS"};

        String id = sc.nextLine();
        String name = sc.nextLine();

        Student s1 = new Student(id, name, courses);
        Student s2 = new Student(s1);

        s1.mutator();

        s2.display();
    }    
}

// Complete the definition of the given class by defining appropriate constructors and member functions 
// such that it is in coherence with the given main method and produce the required output

import java.util.*;

class Employee
{
    String eid;
    String ename;
    String eprojects[];
    public Employee(String id, String name, String[] projects) {
        this.eid = id;
        this.ename = name;

        // Deep copy of array
        this.eprojects = new String[projects.length];
        for (int i = 0; i < projects.length; i++) {
            this.eprojects[i] = projects[i];
        }
    }

    // Copy constructor (copy all data members from e1)
    public Employee(Employee e) {
        this.eid = e.eid;
        this.ename = e.ename;

        this.eprojects = new String[e.eprojects.length];
        for (int i = 0; i < e.eprojects.length; i++) {
            this.eprojects[i] = e.eprojects[i];
        }
    }

    // Default constructor (copies from e1)
    public Employee() {
        // This will be set later from copy constructor logic in main
    }

    // Display method
    public void display() {
        System.out.println("eid : " + eid);
        System.out.println("ename : " + ename);
        for (int i = 0; i < eprojects.length; i++) {
            System.out.println("eprojects[" + i + "] : " + eprojects[i]);
        }
    }

    //define all the required methods here 

    public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
}

public class grpa3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            String project[] = {"P001","P002","P003"};
        //enter the id of employee
        String id = s.nextLine();
        //enter the name of employee
        String name = s.nextLine();

        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee();
        //The copy constructor must copy all the data members.

        e1.mutator();

        e2.display();
    }    
}

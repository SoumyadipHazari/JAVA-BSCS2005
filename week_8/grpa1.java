/*
The program stores a list of Employee objects, each of which has name, department and salary as instance variables. A user can query the list to find the Employees who belong to a specific department and have salary greater than or equal to the input salary. Complete the program as specified.
Define a class Employee as follows:
Add the instance variables to represent name, department and salary
Implement the required constructor(s) and accessors.
Override the method toString() so that the format of the output is in accordance with those in the test cases. 

Define a function query that takes a list of employees, a department and a salary as input. It returns a stream comprising the Employee objects that have the same department and have salary greater and equal to the given salary.	
*/

package week_8;
import java.util.*;
import java.util.stream.*;

// define class employee

public class grpa1 {
    //define method query


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var eList = new ArrayList<Employee>();
        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "HR", 50000));
        eList.add(new Employee("Bella", "IT", 60000));
        eList.add(new Employee("Jacob", "IT", 70000));
        eList.add(new Employee("James", "HR", 80000));
    }
}

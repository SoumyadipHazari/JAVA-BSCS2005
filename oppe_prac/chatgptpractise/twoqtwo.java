/*
An employee has a basic salary. 
If salary is greater than 50,000 → bonus = 10%, otherwise → bonus = 5%. Print total salary.
*/

package chatgptpractise;
import java.util.*;

class Employee {
    double salary;

    // LINE-1: write method setSalary(double s)
    public void setSalary(double s){
        this.salary = s;
    }
    // LINE-2: write method calculateTotalSalary()
    // return salary + bonus
    double calculateTotalSalary(){
        if (salary > 50000){
            return salary+(salary*0.1);
        }else{
            return salary+(salary*0.05);
        }

    }
}

public class twoqtwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();

        Employee e = new Employee();
        e.setSalary(s);

        System.out.println(e.calculateTotalSalary());
    }   
}

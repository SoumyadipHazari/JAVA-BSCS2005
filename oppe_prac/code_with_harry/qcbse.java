/* calculate percentage of  5 subjects where it is given by user*/

package code_with_harry;

import java.util.Scanner;

public class qcbse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();

        if (a > 100 || b > 100 || c > 100 || d > 100 || e > 100) {
            System.out.println("Error give the correct marks");
        } else {
            float percentage = (a+b+c+d+e)/500.0f * 100 ; 
            System.out.println("The percentage is -- " +percentage);
        }
    }
    
}

/*

Write a program to find the sum of the following series up to n terms.
1^2 + ( 1^2 + 2^2 ) + ( 1^2 + 2^2 + 3^2 ) + ......... + ( 1^2 + 2^2 + .... + n^2 )
*/
package week2;

import java.util.Scanner;

public class grpa1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int power = 0;
        int sum = 0;
        for (int x = 1; x <= n; x++){
            power += x*x;
            sum += power; 
        }
        System.out.println(sum);
    }
}

//Write a program to find the sum of the following series up to n terms. 
// 1^2 + ( 1^2 + 2^2 ) + ( 1^2 + 2^2 + 3^2 ) + ......... + ( 1^2 + 2^2 + .... + n^2 )

import java.util.*;
public class SeriesSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int innerSum = 0;
        for (int i = 1; i <= n; i++) {
            innerSum += i*i;
            sum += innerSum;
        }
System.out.println(sum);
    }
}
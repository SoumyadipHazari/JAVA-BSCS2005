/*
Find the sum:
1 + (1 + 2) + (1 + 2 + 3) + ... up to n terms
*/

package week2.seriesprob;

import java.util.*;

public class qone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for(int x = 1; x <= n; x++){
            for(int y = 1; y <= x; y++){
                sum += y;
            }
        }
        System.out.println(sum);
    }
}

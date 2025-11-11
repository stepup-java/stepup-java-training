package Prajwal_Kalaskar_Assignment;

import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
//        13. Find factorial of a number
//        Input: 5
//        Output: 120

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
           int fact=1;
            for(int i = 1; i<=n; i++){
                // 1*2*3*4*5
                fact = fact * i;
                // 1 * 1 = 1,
                // 1 * 2 = 2,
                // 2 * 3 = 6,
                // 6 * 4 = 24,
                // 24 * 5 =     48+24 =72 + 24 = 96 + 24 = 120



            }
        System.out.println(fact);
    }
}

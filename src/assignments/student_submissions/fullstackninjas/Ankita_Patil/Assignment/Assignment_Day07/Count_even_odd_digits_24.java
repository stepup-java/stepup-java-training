// 24. Count even and odd digits in a number

package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

import java.util.Scanner;

public class Count_even_odd_digits_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), even = 0, odd = 0;
        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0) even++; else odd++;
            n /= 10;
        }
        System.out.println("Even = " + even + ", Odd = " + odd);
    }
}

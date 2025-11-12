// 15. Sum of digits in a number

package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

import java.util.Scanner;

public class SumofDigits_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10; }
        System.out.println("Sum = " + sum);
    }
}

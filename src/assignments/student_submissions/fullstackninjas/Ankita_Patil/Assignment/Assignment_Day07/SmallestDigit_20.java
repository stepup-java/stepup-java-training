// 20. Find smallest digit in a number

package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

import java.util.Scanner;

public class SmallestDigit_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min = 9;
        while (n != 0) {
            int d = n % 10;
            if (d < min) min = d;
            n /= 10;
        }
        System.out.println("Smallest = " + min);

    }
}

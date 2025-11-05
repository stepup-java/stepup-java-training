                        /* Program 20: Find smallest digit in a number */

package assignments.student_submissions.steupAndLearn;

import java.util.Scanner;

public class FindSmallestDigit {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int min = 9;

            while (num != 0) {
                int digit = num % 10;
                if (digit < min) min = digit;
                num /= 10;
            }

            System.out.println("Smallest Digit = " + min);
        }
    }



                         /* Program 21: Check if number is Armstrong*/

package assignments.student_submissions.steupAndLearn;

import java.util.Scanner;

public class ArmastrongOrNot {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int original = num, sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }

            if (sum == original)
                System.out.println("Armstrong Number");
            else
                System.out.println("Not Armstrong");
            sc.close();
        }
    }



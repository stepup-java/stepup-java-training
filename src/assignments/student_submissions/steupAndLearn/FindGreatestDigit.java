package assignments.student_submissions.steupAndLearn;

import java.util.Scanner;

public class FindGreatestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int max = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit > max) max = digit;
            num /= 10;
        }

        System.out.println("Gretest Digit:- "+ max);
    }
}

package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

import java.util.Scanner;

// Q19: Greatest digit in a number
public class GreatestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int max = 0;
        while(n > 0) {
            int digit = n % 10;
            if(digit > max) max = digit;
            n /= 10;
        }
        System.out.println("Greatest digit = " + max);
    }
}


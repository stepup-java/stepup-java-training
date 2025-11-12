package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

import java.util.Scanner;

// Q20: Smallest digit in a number
public class SmallestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int min = 9;
        while(n > 0) {
            int digit = n % 10;
            if(digit < min) min = digit;
            n /= 10;
        }
        System.out.println("Smallest digit = " + min);
    }
}


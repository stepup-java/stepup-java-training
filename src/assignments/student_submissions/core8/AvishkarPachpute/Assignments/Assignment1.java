package assignments.student_submissions.core8.AvishkarPachpute.Assignments;

import java.util.*;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- Q1 ----------------
        System.out.println("\nQ1: Print numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) System.out.print(i + " ");

        // ---------------- Q2 ----------------
        System.out.println("\n\nQ2: Print numbers from 10 to 1");
        for (int i = 10; i >= 1; i--) System.out.print(i + " ");

        // ---------------- Q3 ----------------
        System.out.println("\n\nQ3: Print even numbers from 1 to 20");
        for (int i = 2; i <= 20; i += 2) System.out.print(i + " ");

        // ---------------- Q4 ----------------
        System.out.println("\n\nQ4: Print odd numbers from 1 to 20");
        for (int i = 1; i <= 20; i += 2) System.out.print(i + " ");

        // ---------------- Q5 ----------------
        System.out.println("\n\nQ5: Print table of 5");
        for (int i = 1; i <= 10; i++) System.out.print(5 * i + " ");

        // ---------------- Q6 ----------------
        System.out.println("\n\nQ6: Print table of any number (input by user)");
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) System.out.print(n * i + " ");

        // ---------------- Q7 ----------------
        System.out.println("\n\nQ7: Sum of first 10 natural numbers");
        int sum = 0;
        for (int i = 1; i <= 10; i++) sum += i;
        System.out.println("Sum = " + sum);

        // ---------------- Q8 ----------------
        System.out.println("\nQ8: Sum of even numbers from 1 to 50");
        sum = 0;
        for (int i = 2; i <= 50; i += 2) sum += i;
        System.out.println("Sum = " + sum);

        // ---------------- Q9 ----------------
        System.out.println("\nQ9: Sum of odd numbers from 1 to 50");
        sum = 0;
        for (int i = 1; i <= 50; i += 2) sum += i;
        System.out.println("Sum = " + sum);

        // ---------------- Q10 ----------------
        System.out.println("\nQ10: Squares of numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) System.out.print(i * i + " ");

        // ---------------- Q11 ----------------
        System.out.println("\n\nQ11: Cubes of numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) System.out.print(i * i * i + " ");

        // ---------------- Q12 ----------------
        System.out.println("\n\nQ12: Numbers divisible by 3 from 1 to 50");
        for (int i = 3; i <= 50; i += 3) System.out.print(i + " ");

        // ---------------- Q13 ----------------
        System.out.println("\n\nQ13: Factorial of a number");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial = " + fact);

        // ---------------- Q14 ----------------
        System.out.println("\nQ14: Count digits in a number");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int count = 0, temp = n;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Count = " + count);

        // ---------------- Q15 ----------------
        System.out.println("\nQ15: Sum of digits in a number");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int sumDigits = 0;
        temp = n;
        while (temp != 0) {
            sumDigits += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum = " + sumDigits);

        // ---------------- Q16 ----------------
        System.out.println("\nQ16: Reverse a number");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int rev = 0;
        temp = n;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse = " + rev);

        // ---------------- Q17 ----------------
        System.out.println("\nQ17: Check if a number is palindrome");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        temp = n; rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println((n == rev) ? "Palindrome" : "Not Palindrome");

        // ---------------- Q18 ----------------
        System.out.println("\nQ18: Product of digits");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int product = 1;
        temp = n;
        while (temp != 0) {
            product *= temp % 10;
            temp /= 10;
        }
        System.out.println("Product = " + product);

        // ---------------- Q19 ----------------
        System.out.println("\nQ19: Greatest digit in a number");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int max = 0;
        temp = n;
        while (temp != 0) {
            int d = temp % 10;
            if (d > max) max = d;
            temp /= 10;
        }
        System.out.println("Greatest digit = " + max);

        // ---------------- Q20 ----------------
        System.out.println("\nQ20: Smallest digit in a number");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int min = 9;
        temp = n;
        while (temp != 0) {
            int d = temp % 10;
            if (d < min) min = d;
            temp /= 10;
        }
        System.out.println("Smallest digit = " + min);

        // ---------------- Q21 ----------------
        System.out.println("\nQ21: Check if number is Armstrong");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        temp = n;
        int sumArm = 0;
        while (temp != 0) {
            int d = temp % 10;
            sumArm += d * d * d;
            temp /= 10;
        }
        System.out.println((n == sumArm) ? "Armstrong Number" : "Not Armstrong");

        // ---------------- Q22 ----------------
        System.out.println("\nQ22: First 10 multiples of 7");
        for (int i = 1; i <= 10; i++) System.out.print(7 * i + " ");

        // ---------------- Q23 ----------------
        System.out.println("\n\nQ23: Numbers from 1 to 100 divisible by both 3 and 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " ");
        }

        // ---------------- Q24 ----------------
        System.out.println("\n\nQ24: Count even and odd digits in a number");
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int even = 0, odd = 0;
        temp = n;
        while (temp != 0) {
            int d = temp % 10;
            if (d % 2 == 0) even++; else odd++;
            temp /= 10;
        }
        System.out.println("Even = " + even + ", Odd = " + odd);

        // ---------------- Q25 ----------------
        System.out.println("\nQ25: Sum of numbers from 1 to n");
        System.out.print("Enter n: ");
        n = sc.nextInt();
        sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum = " + sum);

        // ---------------- Q26 ----------------
        System.out.println("\nQ26: Use break to stop loop when number reaches 5");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.print(i + " ");
        }

        // ---------------- Q27 ----------------
        System.out.println("\n\nQ27: Use continue to skip number 5");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;
            System.out.print(i + " ");
        }

        // ---------------- Q28 ----------------
        System.out.println("\n\nQ28: Stop if number divisible by 9 (1–20)");
        for (int i = 1; i <= 20; i++) {
            if (i % 9 == 0) break;
            System.out.print(i + " ");
        }

        // ---------------- Q29 ----------------
        System.out.println("\n\nQ29: Prime numbers from 1 to 50");
        for (int i = 2; i <= 50; i++) {
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { prime = false; break; }
            }
            if (prime) System.out.print(i + " ");
        }

        // ---------------- Q30 ----------------
        System.out.println("\n\nQ30: Fibonacci series up to 10 terms");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        sc.close();
    }
}

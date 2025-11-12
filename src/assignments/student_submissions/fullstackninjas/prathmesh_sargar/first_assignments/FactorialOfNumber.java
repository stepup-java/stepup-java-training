package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

import java.util.Scanner;

// Q13: Factorial of a number
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}


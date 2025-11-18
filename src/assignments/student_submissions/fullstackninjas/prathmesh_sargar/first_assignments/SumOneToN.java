package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

import java.util.Scanner;

// Q25: Sum of numbers from 1 to n
public class SumOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt(), sum = 0;
        for(int i=1; i<=n; i++) sum += i;
        System.out.println("Sum = " + sum);
    }
}


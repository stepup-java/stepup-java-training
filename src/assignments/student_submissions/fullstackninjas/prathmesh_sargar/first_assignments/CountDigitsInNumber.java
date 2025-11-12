package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

import java.util.Scanner;

// Q14: Count digits in a number
public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        while(n > 0) {
            count++;
            n /= 10;
        }
        System.out.println("Count = " + count);
    }
}


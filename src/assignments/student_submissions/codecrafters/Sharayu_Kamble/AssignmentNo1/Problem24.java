package assignments.student_submissions.codecrafters.Sharayu_Kamble.AssignmentNo1;

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int even = 0, odd = 0;
        while(n > 0) {
            int d = n % 10;
            if(d % 2 == 0) even++; else odd++;
            n /= 10;
        }
        System.out.println("Even = " + even + ", Odd = " + odd);
    }
}

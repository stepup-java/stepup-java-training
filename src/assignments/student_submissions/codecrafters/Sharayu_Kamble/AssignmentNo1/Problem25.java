package assignments.student_submissions.codecrafters.Sharayu_Kamble.AssignmentNo1;

import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt(), sum = 0;
        for(int i=1; i<=n; i++) sum += i;
        System.out.println("Sum = " + sum);
    }
}

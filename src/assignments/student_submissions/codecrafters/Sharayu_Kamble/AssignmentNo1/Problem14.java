package assignments.student_submissions.codecrafters.Sharayu_Kamble.AssignmentNo1;

import java.util.Scanner;

public class Problem14 {
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

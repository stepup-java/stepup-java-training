package assignments.student_submissions.codecrafters.Sharayu_Kamble.AssignmentNo1;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbur: ");
        int i = sc.nextInt();

        for(; i<=70; i += 7)

            System.out.println(i);
    }
}

package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 20: Find smallest digit in a number
import java.util.Scanner;

public class Q20_SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;

        while (n > 0) {
            int d = n % 10;
            if (d < min)
                min = d;
            n /= 10;
        }
        System.out.println(min);
        sc.close();
    }
}
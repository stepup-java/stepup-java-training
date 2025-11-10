package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 15: Sum of digits in a number
import java.util.Scanner;
public class Q15_SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 16: Reverse a number
import java.util.Scanner;
public class Q16_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(rev);
        sc.close();
    }
}
package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 14: Count digits in a number
import java.util.Scanner;

public class Q14_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("Count = " + count);
        sc.close();
    }
}
package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 19: Find greatest digit in a number
import java.util.Scanner;
public class Q19_GreatestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int max = 0;
        
        while (n > 0) {
            int d = n % 10;
            if (d > max) max = d;
            n /= 10;
        }
        System.out.println(max);
        sc.close();
    }
}
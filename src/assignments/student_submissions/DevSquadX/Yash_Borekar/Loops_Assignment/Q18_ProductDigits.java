package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 18: Find product of digits in a number
import java.util.Scanner;
public class Q18_ProductDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int prod = 1;
        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        System.out.println(prod);
        sc.close();
    }
}
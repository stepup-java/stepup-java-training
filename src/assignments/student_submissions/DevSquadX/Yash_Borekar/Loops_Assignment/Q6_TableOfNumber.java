package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 6: Print table of any number (input by user)
import java.util.Scanner;

public class Q6_TableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " -> " + n * i);
        }
        sc.close();
    }
}
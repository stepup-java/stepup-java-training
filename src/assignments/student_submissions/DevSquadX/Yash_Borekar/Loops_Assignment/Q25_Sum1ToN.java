package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 25: Find sum of numbers from 1 to n
import java.util.Scanner;
public class Q25_Sum1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) 
         sum += i;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 13: Find factorial of a number
import java.util.Scanner;
public class Q13_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        
        int fact = 1;
        for (int i = 1; i <= n; i++) 
         fact *= i;
        
        System.out.println(fact);
        sc.close();
    }
}
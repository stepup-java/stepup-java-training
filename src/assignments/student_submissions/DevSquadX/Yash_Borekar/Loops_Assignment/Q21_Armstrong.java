package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 21: Check if number is Armstrong
import java.util.Scanner;
public class Q21_Armstrong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int original = n;

        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d*d*d;
            n /= 10;
        }
        if (sum == original)
         System.out.println("Armstrong Number");
        else 
         System.out.println("Not Armstrong");
        sc.close();
    }
}
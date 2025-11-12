package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 17: Check if a number is palindrome
import java.util.Scanner;
public class Q17_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if(num == rev)
            System.out.println("Palindrome");
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
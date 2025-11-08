package assignments.student_submissions.codecrafters.vijay_chopade.assignment.assignment_07;

// Q16: Reverse a number
import java.util.Scanner;
class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), rev = 0;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed = " + rev);
    }
}



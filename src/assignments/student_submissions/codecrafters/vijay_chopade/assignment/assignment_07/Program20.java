package assignments.student_submissions.codecrafters.vijay_chopade.assignment.assignment_07;

// Q20: Smallest digit in a number
import java.util.Scanner;
class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int min = 9;
        while(n > 0) {
            int digit = n % 10;
            if(digit < min) min = digit;
            n /= 10;
        }
        System.out.println("Smallest digit = " + min);
    }
}

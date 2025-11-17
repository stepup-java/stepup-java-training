package assignments.student_submissions.techorbit.neha_ingawale.assignment.assignment_07;

// Q19: Greatest digit in a number
import java.util.Scanner;
class GreatestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int max = 0;
        while(n > 0) {
            int digit = n % 10;
            if(digit > max) max = digit;
            n /= 10;
        }
        System.out.println("Greatest digit = " + max);
    }
}

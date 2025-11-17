package assignments.student_submissions.techorbit.neha_ingawale.assignment.assignment_07;

// Q15: Sum of digits in a number
import java.util.Scanner;
class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum = " + sum);
    }
}

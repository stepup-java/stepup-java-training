package assignments.student_submissions.codecrafters.vijay_chopade.assignment.assignment_07;

// Q18: Product of digits in a number
import java.util.Scanner;
class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int prod = 1;
        while(n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        System.out.println("Product = " + prod);
    }
}

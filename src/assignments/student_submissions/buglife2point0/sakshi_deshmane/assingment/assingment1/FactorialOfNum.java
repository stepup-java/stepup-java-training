package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q13: Factorial of a number
import java.util.Scanner;

class FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}



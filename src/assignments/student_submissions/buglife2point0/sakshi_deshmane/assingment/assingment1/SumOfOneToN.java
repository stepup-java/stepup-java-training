package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q25: Sum of numbers from 1 to n
import java.util.Scanner;

class SumOfOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt(), sum = 0;
        for(int i=1; i<=n; i++) sum += i;
        System.out.println("Sum = " + sum);
    }
}

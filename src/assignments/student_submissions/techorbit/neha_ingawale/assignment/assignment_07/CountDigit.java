package assignments.student_submissions.techorbit.neha_ingawale.assignment.assignment_07;

// Q14: Count digits in a number
import java.util.Scanner;
class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        while(n > 0) {
            count++;
            n /= 10;
        }
        System.out.println("Count = " + count);
    }
}




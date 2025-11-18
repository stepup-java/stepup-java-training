package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q20: Smallest digit in a number
import java.util.Scanner;

class SmallestDigitInNum {
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

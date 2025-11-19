package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;
import java.util.Scanner;
public class GretestNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int greatest = 0; // To store the greatest digit

        while (num > 0) {
            int digit = num % 10; // Get last digit
            if (digit > greatest) {
                greatest = digit; // Update if greater
            }
            num = num / 10; // Remove last digit
        }

        System.out.println("Greatest digit: " + greatest);
    }
}


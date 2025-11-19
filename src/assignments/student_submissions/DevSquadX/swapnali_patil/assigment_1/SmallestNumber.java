package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;
import java.util.Scanner;
public class SmallestNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int smallest = 9;  // maximum possible digit
        while (num > 0) {
            int digit = num % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            num = num / 10;
        }

        System.out.println("Smallest digit: " + smallest);
    }
}

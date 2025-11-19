package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;  // Get last digit
            sum += digit * digit * digit;  // Cube of the digit
            number /= 10;  // Remove last digit
        }

        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}


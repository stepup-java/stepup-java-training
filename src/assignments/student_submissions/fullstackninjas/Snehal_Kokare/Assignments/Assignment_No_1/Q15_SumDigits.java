package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 15: Sum of digits in a number (Input: 1234) using a while loop
class Q15_SumDigits {
    public static void main(String[] args) {
        int number = 1234;
        int tempNumber = number;
        int sum = 0;

        // Use a while loop to extract and sum digits
        while (tempNumber != 0) {
            int digit = tempNumber % 10; // Get the last digit
            sum += digit;
            tempNumber /= 10; // Remove the last digit
        }

        System.out.println("Input: " + number);
        System.out.println("Sum of digits in a number (Input: 1234) using a while loop = " + sum);
    }
}

package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 19: Find greatest digit in a number (Input: 4721) using a while loop
class Q19_GreatestDigit {
    public static void main(String[] args) {
        int number = 4721;
        int tempNumber = number;
        int maxDigit = -1; // Initialize with a value smaller than any possible digit (0-9)

        // Use a while loop to extract and compare digits
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            tempNumber /= 10;
        }

        System.out.println("Input: " + number);
        System.out.println("greatest digit in a number (Input: 4721) using a while loop:\n " + maxDigit);
    }
}
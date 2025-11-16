package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 20: Find smallest digit in a number (Input: 4721) using a while loop
class Q20_SmallestDigit {
    public static void main(String[] args) {
        int number = 4721;
        int tempNumber = number;
        int minDigit = 9; // Initialize with a value larger than any possible digit (0-9)

        // Use a while loop to extract and compare digits
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            tempNumber /= 10;
        }

        System.out.println("Input: " + number);
        System.out.println("smallest digit in a number (Input: 4721) using a while loop: " + minDigit);
    }
}
package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 18: Find product of digits in a number (Input: 234) using a while loop
class Q18_ProductDigits {
    public static void main(String[] args) {
        int number = 234;
        int tempNumber = number;
        long product = 1; // Use long for safety

        // Use a while loop to extract and multiply digits
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            product *= digit;
            tempNumber /= 10;
        }

        System.out.println("Input: " + number);
        System.out.println("product of digits in a number (Input: 234) using a while loop:\n " + product);
    }
}
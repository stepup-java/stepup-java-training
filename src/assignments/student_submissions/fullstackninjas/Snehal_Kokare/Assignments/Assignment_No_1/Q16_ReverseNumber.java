package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 16: Reverse a number (Input: 1234) using a while loop
class Q16_ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        int tempNumber = number;
        int reversedNumber = 0;

        // Use a while loop to extract digits and build the reversed number
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempNumber /= 10;
        }

        System.out.println("Input: " + number);
        System.out.println("Reverse a number (Input: 1234) using a while loop: " + reversedNumber);
    }
}
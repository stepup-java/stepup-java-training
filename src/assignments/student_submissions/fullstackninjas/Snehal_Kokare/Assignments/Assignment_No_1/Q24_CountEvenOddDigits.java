package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 24: Count even and odd digits in a number (Input: 123456) using a while loop
class Q24_CountEvenOddDigits {
    public static void main(String[] args) {
        int number = 123456;
        int tempNumber = number;
        int evenCount = 0;
        int oddCount = 0;

        // Use a while loop to extract digits and check parity
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            tempNumber /= 10;
        }

        System.out.println("Input: " + number);
        System.out.println("Count even and odd digits in a number (Input: 123456) using a while loop:\n Even = " + evenCount + ", Odd = " + oddCount);
    }
}
package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;
// Question 21: Check if number is Armstrong (Input: 153) using while loops
class Q21_Armstrong {
    public static void main(String[] args) {
        checkArmstrong(153);
        checkArmstrong(123);
    }

    public static void checkArmstrong(int number) {
        int originalNumber = number;
        int tempNumber = number;
        int numDigits = 0;
        long sum = 0;

        // First while loop: Count the number of digits
        int countTemp = number;
        while (countTemp != 0) {
            countTemp /= 10;
            numDigits++;
        }

        // Second while loop: Calculate the sum of powers of digits
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            long power = 1;
            // Calculate digit to the power of numDigits
            for (int i = 0; i < numDigits; i++) {
                power *= digit;
            }
            sum += power;
            tempNumber /= 10;
        }

        System.out.print("Input: " + originalNumber + "\nOutput: ");
        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
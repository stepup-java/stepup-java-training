package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 17: Check if a number is palindrome (Input: 121) using a while loop
class Q17_Palindrome {
    public static void main(String[] args) {
        checkPalindrome(121);
        checkPalindrome(123);
    }

    public static void checkPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        int tempNumber = number;

        // Reverse the number using a while loop
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempNumber /= 10;
        }

        System.out.print("Input: " + originalNumber + "\nOutput: ");
        if (originalNumber == reversedNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

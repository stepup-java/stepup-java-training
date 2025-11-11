package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//              Assignment NO 17: Check if a number is palindrome

public class Check_Palindrome {
    public static void main(String[] args) {
        int num = 121;   // you can change it to 123 to test
        int originalNum = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;        // get last digit
            reversed = reversed * 10 + digit;  // add digit to reversed number
            num = num / 10;              // remove last digit
        }

        if (originalNum == reversed) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }
}

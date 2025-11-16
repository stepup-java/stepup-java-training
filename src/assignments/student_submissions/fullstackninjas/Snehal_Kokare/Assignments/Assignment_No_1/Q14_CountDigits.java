package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 14: Count digits in a number (Input: 12345) using a while loop
class Q14_CountDigits {
    public static void main(String[] args) {
        int number = 12345;
        int tempNumber = number;
        int count = 0;

        // Use a while loop to repeatedly divide by 10
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        System.out.println("Input: " + number);
        System.out.println("digits in a number (Input: 12345) using a while loop Count= " + count);
    }
}

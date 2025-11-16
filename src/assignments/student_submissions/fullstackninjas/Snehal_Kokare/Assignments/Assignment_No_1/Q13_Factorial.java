package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 13: Find factorial of a number (Input: 5) using a for loop
class Q13_Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1; // Use long for larger factorials

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Input: " + number);
        System.out.println("factorial of a number (Input: 5) using a for loop: " + factorial);
    }
}
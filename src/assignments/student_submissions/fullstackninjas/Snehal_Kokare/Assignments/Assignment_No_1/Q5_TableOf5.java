package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 5: Print table of 5 (first 10 multiples) using a for loop
class Q5_TableOf5 {
    public static void main(String[] args) {
        int number = 5;
        System.out.print("Table of 5 (first 10 multiples) using a for loop:\n ");
        for (int numbers = 1; numbers <= 10; numbers++) {
            System.out.print((number * numbers) + " ");
        }
        System.out.println();
    }
}
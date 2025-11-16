package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 6: Print table of any number (input 7) using a for loop
class Q6_TableOfN {
    public static void main(String[] args) {
        int number = 7; // Simulating user input
        System.out.print("Table of any number (input 7) using a for loop:\n ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((number * i) + " ");
        }
        System.out.println();
    }
}
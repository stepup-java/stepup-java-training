package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;
// Question 30: Print Fibonacci series up to 10 terms using a for loop
class Q30_Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int terms = 10;

        System.out.print("Fibonacci series up to 10 terms using a for loop:\n ");

        // Handle the first two terms outside the loop
        if (terms >= 1) {
            System.out.print(n1 + " ");
        }
        if (terms >= 2) {
            System.out.print(n2 + " ");
        }

        // Loop from the 3rd term up to the total number of terms
        for (int i = 3; i <= terms; i++) {
            int nextTerm = n1 + n2;
            System.out.print(nextTerm + " ");

            // Shift values for the next iteration
            n1 = n2;
            n2 = nextTerm;
        }
        System.out.println();
    }
}
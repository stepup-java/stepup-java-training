package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;
// Question 27: Use continue to skip printing number 5 from 1 to 10
class Q27_ContinueAt5 {
    public static void main(String[] args) {
        System.out.print(" Use continue to skip printing number 5 from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // The continue statement skips the rest of the loop body for this iteration
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;
// Question 26: Use break to stop loop when number reaches 5 (Print 1 to 10)
class Q26_BreakAt5 {
    public static void main(String[] args) {
        System.out.print("Output: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // The break statement stops the loop entirely
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("(loop stops at 5)");
    }
}
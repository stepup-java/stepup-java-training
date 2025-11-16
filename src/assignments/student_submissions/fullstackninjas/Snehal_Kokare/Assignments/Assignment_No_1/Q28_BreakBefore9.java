package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;
// Question 28: Print numbers 1 to 20, but stop if divisible by 9 using break
class Q28_BreakBefore9 {
    public static void main(String[] args) {
        System.out.print("numbers 1 to 20, but stop if divisible by 9 using break:\n ");
        for (int i = 1; i <= 20; i++) {
            if (i % 9 == 0) {
                // i is 9, so break immediately before printing it
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("(stops before 9)");
    }
}
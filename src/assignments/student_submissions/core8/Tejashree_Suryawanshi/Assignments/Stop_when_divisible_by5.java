package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

// Assignment NO 28: Print numbers 1 to 20, but stop if divisible by 9 using break

public class Stop_when_divisible_by5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 9 == 0) {
                break;  // stop the loop when number is divisible by 9
            }
            System.out.print(i + " ");
        }
    }


}

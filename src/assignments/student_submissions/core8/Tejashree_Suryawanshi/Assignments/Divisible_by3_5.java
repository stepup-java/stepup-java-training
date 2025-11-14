package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

// Assignment NO 23: Print numbers from 1 to 100 divisible by both 3 and 5

public class Divisible_by3_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

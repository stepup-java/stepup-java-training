package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//  Assignment NO: 12  Print numbers divisible by 3 from 1 to 50

public class Divisible_by_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) { // check divisible by 3
                System.out.print(i + " ");
            }
        }
    }
}

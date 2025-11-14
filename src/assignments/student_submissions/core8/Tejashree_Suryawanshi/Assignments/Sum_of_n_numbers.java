package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//       Assignment NO 25: Find sum of numbers from 1 to n

public class Sum_of_n_numbers {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }

}

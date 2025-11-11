package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//             Assignment NO: 13 Find factorial of a number

public class Factorial_numbers {
    public static void main(String[] args) {
        int n = 5;   // number
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;  // multiply each number
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }
}

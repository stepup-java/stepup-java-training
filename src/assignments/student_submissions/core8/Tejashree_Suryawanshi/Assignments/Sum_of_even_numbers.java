package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//        Assignment NO 08:  Calculate sum of even numbers from 1 to 50

public class Sum_of_even_numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) { // check even
                sum = sum + i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}

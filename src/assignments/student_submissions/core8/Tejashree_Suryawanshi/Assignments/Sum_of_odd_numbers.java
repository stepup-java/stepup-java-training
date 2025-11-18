package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//          Assignment NO: 09 Calculate sum of odd numbers from 1 to 50

public class Sum_of_odd_numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) { // check odd
                sum = sum + i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}

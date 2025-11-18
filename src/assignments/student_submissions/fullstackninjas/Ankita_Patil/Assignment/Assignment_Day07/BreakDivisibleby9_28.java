// 28. Print numbers 1 to 20, but stop if divisible by 9 using break

package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

public class BreakDivisibleby9_28 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 9 == 0) break;
            System.out.print(i + " ");
        }
    }
}

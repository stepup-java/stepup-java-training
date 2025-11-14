package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//        Assignment No 27:Use continue to skip printing number 5 from 1 to 10

public class Continue_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;  // skip printing when i is 5
            }
            System.out.print(i + " ");
        }
    }

}

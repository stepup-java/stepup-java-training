package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//         Assignment No 26 : Use break to stop loop when number reaches 5

public class Break_loop_when_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // stop loop when i becomes 5
            }
            System.out.print(i + " ");
        }
    }

}

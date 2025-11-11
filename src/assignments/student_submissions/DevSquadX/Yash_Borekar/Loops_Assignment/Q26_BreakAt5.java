package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 26: Use break to stop loop when number reaches 5
public class Q26_BreakAt5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println(i);
        }
    }
}
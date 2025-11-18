// 27. Use continue to skip printing number 5 from 1 to 10

package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

public class Continueskipat5_27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue; // skips 5
            System.out.print(i + " ");
        }
    }
}

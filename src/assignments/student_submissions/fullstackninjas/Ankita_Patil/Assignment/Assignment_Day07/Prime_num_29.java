// 29. Print all prime numbers from 1 to 50

package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;
public class Prime_num_29 {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0) { prime = false; break; }
            if (prime) System.out.print(i + " ");
        }
    }
}

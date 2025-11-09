                /* Program 28: Stop loop if number is divisible by 9*/

package assignments.student_submissions.steupAndLearn;

public class StopAtDivisibleAt9 {

        public static void main(String[] args) {
            for (int i = 1; i <= 20; i++) {
                if (i % 9 == 0) break;
                System.out.print(i + " ");
            }
        }
    }



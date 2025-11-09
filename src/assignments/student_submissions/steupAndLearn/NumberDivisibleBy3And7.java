                        /*    // Program 23: Numbers from 1 to 100 divisible by both 3 and 5*/

package assignments.student_submissions.steupAndLearn;

public class NumberDivisibleBy3And7 {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.print(i + " ");
            }
        }
    }



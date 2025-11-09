        /*Program 29: Print all prime numbers from 1 to 50*/

package assignments.student_submissions.steupAndLearn;

public class PrimeNum1To50 {
        public static void main(String[] args) {
            for (int i = 2; i <= 50; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    System.out.print(i + " ");
            }
        }
    }



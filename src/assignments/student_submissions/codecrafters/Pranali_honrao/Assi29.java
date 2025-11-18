package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi29 {

        public static void main(String[] args) {
            for (int i = 2; i <= 50; i++) {
                boolean isPrime = true;

                // check if i is divisible by any number from 2 to i-1
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;  // not a prime number
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }



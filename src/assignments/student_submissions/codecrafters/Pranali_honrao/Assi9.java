package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi9 {

        public static void main(String[] args) {
            int sum = 0;

            for (int i = 1; i <= 50; i++) {
                if (i % 2 != 0) { // Check if the number is odd
                    sum += i;     // Add odd number to sum
                }
            }

            System.out.println("Sum = " + sum);
        }
    }



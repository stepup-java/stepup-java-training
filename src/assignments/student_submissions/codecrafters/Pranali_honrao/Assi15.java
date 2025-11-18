package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi15 {
        public static void main(String[] args) {
            int num = 1234;
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;  // extract last digit
                sum = sum + digit;     // add to sum
                num = num / 10;        // remove last digit
            }

            System.out.println("Sum = " + sum);
        }
    }



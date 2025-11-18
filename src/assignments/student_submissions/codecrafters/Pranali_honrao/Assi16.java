package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi16 {

        public static void main(String[] args) {
            int num = 1234;
            int rev = 0;

            while (num != 0) {
                int digit = num % 10;     // get last digit
                rev = rev * 10 + digit;   // add digit to reverse
                num = num / 10;           // remove last digit
            }

            System.out.println("Reversed Number = " + rev);
        }
    }




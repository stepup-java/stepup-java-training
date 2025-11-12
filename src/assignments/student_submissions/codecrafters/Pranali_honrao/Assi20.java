package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi20 {
        public static void main(String[] args) {
            int num = 4721;
            int smallest = 9;

            while (num != 0) {
                int digit = num % 10;     // extract last digit
                if (digit < smallest) {
                    smallest = digit;     // update smallest digit
                }
                num = num / 10;           // remove last digit
            }

            System.out.println("Smallest digit = " + smallest);
        }
    }



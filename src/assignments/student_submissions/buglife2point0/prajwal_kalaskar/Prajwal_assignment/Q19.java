package assignments.student_submissions.buglife2point0.prajwal_kalaskar.Prajwal_assignment;

public class Q19 {


        public static void main(String[] args) {
            int num = 4721;
            int max = 0;

            while (num > 0) {
                int digit = num % 10;  // extract last digit
                if (digit > max) {
                    max = digit;      // update max
                }
                num = num / 10;        // remove last digit
            }

            System.out.println("Greatest digit: " + max);
        }
    }


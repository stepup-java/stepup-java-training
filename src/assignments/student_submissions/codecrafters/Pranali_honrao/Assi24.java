package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi24 {

        public static void main(String[] args) {
            int num = 123456;
            int even = 0, odd = 0;

            while (num != 0) {
                int digit = num % 10;   // extract last digit

                if (digit % 2 == 0)
                    even++;             // even digit count
                else
                    odd++;              // odd digit count

                num = num / 10;         // remove last digit
            }

            System.out.println("Even = " + even + ", Odd = " + odd);
        }
    }



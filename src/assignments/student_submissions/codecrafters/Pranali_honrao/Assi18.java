package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi18 {

        public static void main(String[] args) {
            int num = 234;
            int product = 1;

            while (num != 0) {
                int digit = num % 10;     // extract last digit
                product = product * digit; // multiply digits
                num = num / 10;           // remove last digit
            }

            System.out.println("Product = " + product);
        }
    }


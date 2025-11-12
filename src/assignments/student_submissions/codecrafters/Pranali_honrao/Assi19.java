package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi19 {
    public static void main(String[] args) {
        int num = 4721;
        int greatest = 0;

        while (num != 0) {
            int digit = num % 10;     // extract last digit
            if (digit > greatest) {
                greatest = digit;     // update greatest digit
            }
            num = num / 10;           // remove last digit
        }

        System.out.println("Greatest digit = " + greatest);
    }
}

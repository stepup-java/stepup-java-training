package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//            Assignment NO 19: Find greatest digit in a number

public class Greatest_Number {
    public static void main(String[] args) {
        int num = 4721;
        int max = 0;

        while (num > 0) {
            int digit = num % 10;   // get last digit
            if (digit > max) {
                max = digit;        // update max if digit is greater
            }
            num = num / 10;         // remove last digit
        }

        System.out.println("Greatest digit = " + max);
    }
}


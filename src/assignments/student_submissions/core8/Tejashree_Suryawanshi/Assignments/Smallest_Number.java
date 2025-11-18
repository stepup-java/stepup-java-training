package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//             Assignment NO 20: Find smallest digit in a number

public class Smallest_Number {
    public static void main(String[] args) {
        int num = 4721;
        int min = 9;   // start with highest possible digit

        while (num > 0) {
            int digit = num % 10;   // get last digit
            if (digit < min) {
                min = digit;        // update min if digit is smaller
            }
            num = num / 10;         // remove last digit
        }

        System.out.println("Smallest digit = " + min);
    }

}

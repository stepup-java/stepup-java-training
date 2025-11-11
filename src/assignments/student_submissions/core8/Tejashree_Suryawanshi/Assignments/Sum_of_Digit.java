package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//                Assignment No:15 Sum of digits in a number

public class Sum_of_Digit {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;  // get last digit
            sum = sum + digit;     // add it to sum
            num = num / 10;        // remove last digit
        }

        System.out.println("Sum = " + sum);
    }


}

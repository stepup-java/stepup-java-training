package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//                Assignment NO 14: Count digits in a number

public class Count_Digit {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;

        while (num != 0) {
            num = num / 10;   // remove last digit
            count++;          // increase count
        }

        System.out.println("Count = " + count);
    }
}

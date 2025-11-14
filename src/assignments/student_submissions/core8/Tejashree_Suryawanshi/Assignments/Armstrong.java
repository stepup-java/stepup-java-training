package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//            Assignment NO 21: Check if number is Armstrong

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;       // example number
        int original = num;  // store original number
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;       // get last digit
            sum = sum + (digit * digit * digit);  // cube each digit and add
            num = num / 10;              // remove last digit
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}

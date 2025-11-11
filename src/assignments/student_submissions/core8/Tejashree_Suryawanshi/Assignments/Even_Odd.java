package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

// Assignment NO 24:  Count even and odd digits in a number

public class Even_Odd {
    public static void main(String[] args) {
        int num = 123456;
        int evenCount = 0, oddCount = 0;

        while (num > 0) {
            int digit = num % 10;   // get last digit

            if (digit % 2 == 0)
                evenCount++;        // increase even count
            else
                oddCount++;         // increase odd count

            num = num / 10;         // remove last digit
        }

        System.out.println("Even = " + evenCount + ", Odd = " + oddCount);
    }
}

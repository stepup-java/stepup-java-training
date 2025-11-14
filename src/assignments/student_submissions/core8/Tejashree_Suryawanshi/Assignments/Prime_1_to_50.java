package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//           Assignment NO 29: Print all prime numbers from 1 to 50

public class Prime_1_to_50 {
    public static void main(String[] args) {
        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;

            // check if num is divisible by any number from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;  // not a prime number
                }
            }

            if (isPrime)
                System.out.print(num + " ");
        }
    }
}

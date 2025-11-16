package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;
// Question 29: Print all prime numbers from 1 to 50 using nested loops
class Q29_Prime1To50 {
    public static void main(String[] args) {
        System.out.print("prime numbers from 1 to 50 using nested loops:\n ");
        for (int i = 1; i <= 50; i++) {
            if (i <= 1) { // 1 is not prime
                continue;
            }

            boolean isPrime = true;
            // Check divisibility from 2 up to i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // No need to check further if a divisor is found
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
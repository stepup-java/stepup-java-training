package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 29: Print all prime numbers from 1 to 50
import java.util.Scanner;

public class Q29_Primes1To50 {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean result = isPrime(input);
        if (result)
            System.out.println(input + " is a prime number");
        else
            System.out.println(input + " is not a prime number");
        scanner.close();

    }
}
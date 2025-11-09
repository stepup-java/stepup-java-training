                        /* Program 24: Count even and odd digits in a number*/

package assignments.student_submissions.steupAndLearn;

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                int even = 0, odd = 0;

                while (num != 0) {
                    int digit = num % 10;
                    if (digit % 2 == 0) even++;
                    else odd++;
                    num /= 10;
                }

                System.out.println("Even = " + even + ", Odd = " + odd);

            }
}

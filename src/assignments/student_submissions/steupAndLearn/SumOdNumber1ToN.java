                    /* Program 25: Find sum of numbers from 1 to n*/

package assignments.student_submissions.steupAndLearn;

import java.util.Scanner;
public class SumOdNumber1ToN {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum = " + sum);
            sc.close();
        }
    }



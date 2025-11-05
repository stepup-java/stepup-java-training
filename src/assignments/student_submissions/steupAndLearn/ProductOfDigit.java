                                         /*Find product of digits in a number*/

package assignments.student_submissions.steupAndLearn;

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        int p = 1;

        while ( num != 0 )
        {
            p *= num % 10;
            num = num/10;
        }
        System.out.println(p);
    }
}

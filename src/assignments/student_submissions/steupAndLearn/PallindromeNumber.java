                                /*Number is pallindrome or not*/

package assignments.student_submissions.steupAndLearn;

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:-  ");
        int num = scanner.nextInt();
        int rev=0;
        int org_num = num;

        while (num != 0)
        {
            rev = rev * 10 + num % 10;
            num = num/10;
        }

        if (rev == org_num)
        {
            System.out.println("Number is pallindrome");
        }
        else {
            System.out.println("Number is not pallindrome");
        }
    }
}

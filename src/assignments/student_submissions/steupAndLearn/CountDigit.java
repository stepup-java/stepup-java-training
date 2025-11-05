                                          /* Count digits in a number*/

package assignments.student_submissions.steupAndLearn;

import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-  ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0 )
        {
            temp = temp/10;
            count++;
        }

        System.out.println("Count:- " + count);
    }
}

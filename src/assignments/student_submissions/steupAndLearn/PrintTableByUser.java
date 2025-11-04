                                  /* Print table by user*/

package assignments.student_submissions.steupAndLearn;

import java.util.Scanner;

public class PrintTableByUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for (int i=1; i<=10; i++)
        {
            System.out.println(num + "x" + i + " " + "=" + (num*i));
        }

        sc.close();
    }
}

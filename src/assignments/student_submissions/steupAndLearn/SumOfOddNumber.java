                                /*Calculate sum of odd numbers from 1 to 50*/

package assignments.student_submissions.steupAndLearn;

public class SumOfOddNumber {

    public static void main(String[] args) {

        int sum = 0;

        for (int i=1; i<=50; i++)
        {
            if (i % 2 != 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("Sum od odd numbers:- " + sum);
    }
}

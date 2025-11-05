                                    /* Sum of digits in a number*/

package assignments.student_submissions.steupAndLearn;

                                    import java.util.Scanner;

                                    public class SumOfDigit
{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:- ");
            int num = sc.nextInt();
            int sum = 0;

            while(num != 0)
            {
                int digit = num % 10;
                sum  += digit;
                num /= 10;
            }

        System.out.println("Sum of digit is :- " + sum);
    }
}

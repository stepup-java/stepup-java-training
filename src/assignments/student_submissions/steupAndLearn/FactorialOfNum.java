                                     /*Find factorial of a number*/

package assignments.student_submissions.steupAndLearn;

                                     import java.util.Scanner;

                                     public class FactorialOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numebr:- ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }

        System.out.println("Factorial of a number is:- " +  fact);
    }
}

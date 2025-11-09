             /*    Program 30: Print Fibonacci series up to 10 terms*/

package assignments.student_submissions.steupAndLearn;

public class FibonacciSeries {
        public static void main(String[] args) {
            int n1 = 0, n2 = 1, n3;
            System.out.print(n1 + " " + n2 + " ");

            for (int i = 3; i <= 10; i++) {
                n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
            }
        }
    }



// 30. Print Fibonacci series up to 10 terms

package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

public class Fibonacci_30 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < 10; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}

package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//          Assignment NO 30 : Print Fibonacci series up to 10 terms

public class Fibonncci_number {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " "); // print first two terms

        for (int i = 3; i <= 10; i++) {
            n3 = n1 + n2;     // next term is the sum of previous two
            System.out.print(n3 + " ");
            n1 = n2;          // shift n1 to next
            n2 = n3;          // shift n2 to next
        }
    }
}

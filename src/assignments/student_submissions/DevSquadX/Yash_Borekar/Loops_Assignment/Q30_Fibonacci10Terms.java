package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;

// Question 30: Print Fibonacci series up to 10 terms
public class Q30_Fibonacci10Terms {
     static void main(String[] args) {
        int terms = 10;
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < terms; i++) {
                int c = a + b;
                a = b;
                b = c;
            System.out.println(c);
        }
    }
}
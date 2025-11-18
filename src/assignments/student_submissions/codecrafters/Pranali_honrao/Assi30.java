package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi30 {
        public static void main(String[] args) {
            int n = 10;     // number of terms
            int a = 0, b = 1;

            System.out.print(a + " " + b + " ");  // print first two terms

            for (int i = 3; i <= n; i++) {
                int c = a + b;   // next term
                System.out.print(c + " ");
                a = b;           // update values
                b = c;
            }
        }
    }



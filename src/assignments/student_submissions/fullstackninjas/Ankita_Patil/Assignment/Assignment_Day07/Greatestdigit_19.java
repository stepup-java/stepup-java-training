// 19. Find greatest digit in a number

package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;
import java.util.Scanner;

public class Greatestdigit_19 {
    class GreatestDigit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(), max = 0;
            while (n != 0) {
                int d = n % 10;
                if (d > max) max = d;
                n /= 10;
            }
            System.out.println("Greatest = " + max);
        }
    }

}

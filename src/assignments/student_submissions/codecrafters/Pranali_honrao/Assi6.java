package assignments.student_submissions.codecrafters.Pranali_honrao;
import java.util.Scanner;

    public class Assi6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.print((num * i) + " ");
            }

            sc.close();
        }
    }



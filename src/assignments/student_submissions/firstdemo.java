package assignments.student_submissions;
import java.util.Scanner;
import java.time.Year;
public class firstdemo {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your birth year: ");
            int birthYear = input.nextInt();

            int currentYear = Year.now().getValue(); // gets the current year automatically
            int age = currentYear - birthYear;

            if (age < 0) {
                System.out.println("Invalid birth year entered!");
            } else {
                System.out.println("You are " + age + " years old.");
            }

            input.close();
        }
    }



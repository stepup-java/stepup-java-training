package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi21 {

        public static void main(String[] args) {
            int num = 153;
            int temp = num;
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;           // extract last digit
                sum = sum + (digit * digit * digit); // cube and add
                num = num / 10;                 // remove last digit
            }

            if (temp == sum)
                System.out.println("Armstrong Number");
            else
                System.out.println("Not Armstrong Number");
        }
    }



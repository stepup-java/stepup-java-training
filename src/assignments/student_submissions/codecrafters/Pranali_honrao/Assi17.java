package assignments.student_submissions.codecrafters.Pranali_honrao;

public class Assi17 {

    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;     // get last digit
            rev = rev * 10 + digit;   // form reverse number
            num = num / 10;           // remove last digit
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

}



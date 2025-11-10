package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q17: Check if number is palindrome
import java.util.Scanner;

class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), temp = n, rev = 0;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

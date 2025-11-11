package assignments.student_submissions.buglife2point0.prajwal_kalaskar.Prajwal_assignment;//17. Check if a number is palindrome
//Input: 121
//Output: Palindrome
//Input: 123
//Output: Not Palindrome

import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();

        int original = num;
        int rev = 0;

        while(num!=0){

            int digit = num % 10 ;
            rev = rev*10 + digit;
            num = num/10;


        }

        if(original == rev){
            System.out.println("The number is palindrome");

        }else {
            System.out.println("The number is not palindrome");

        }
    }
}


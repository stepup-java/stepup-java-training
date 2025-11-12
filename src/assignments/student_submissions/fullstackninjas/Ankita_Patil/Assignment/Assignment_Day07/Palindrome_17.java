// 17. Check if a number is palindrome

package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

import java.util.Scanner;

public class Palindrome_17 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int temp = n, rev = 0;
            while (n != 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
        }
    }



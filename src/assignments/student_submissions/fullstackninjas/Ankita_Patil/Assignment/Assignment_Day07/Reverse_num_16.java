// 16. Reverse a number
package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

import java.util.Scanner;

public class Reverse_num_16 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(), rev = 0;
            while (n != 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            System.out.println("Reverse = " + rev);
        }
    }



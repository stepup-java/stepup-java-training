// 18. Find product of digits in a number
package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

import java.util.Scanner;

public class ProductofDigits_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), prod = 1;
        while (n != 0) {
            prod *= n % 10;
            n /= 10;
        }
        System.out.println("Product = " + prod);
    }
}

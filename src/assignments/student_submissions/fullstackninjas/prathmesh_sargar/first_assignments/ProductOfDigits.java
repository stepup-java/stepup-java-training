package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

import java.util.Scanner;

// Q18: Product of digits in a number
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int prod = 1;
        while(n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        System.out.println("Product = " + prod);
    }
}


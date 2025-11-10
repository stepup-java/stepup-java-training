package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q18: Product of digits in a number
import java.util.Scanner;

class ProductOfDigitInNum {
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

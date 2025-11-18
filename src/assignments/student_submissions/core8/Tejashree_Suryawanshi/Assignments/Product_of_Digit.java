package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

//            Assignment NO 18: Find product of digits in a number

public class Product_of_Digit {
    public static void main(String[] args) {
        int num = 234;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;     // get last digit
            product = product * digit; // multiply with product
            num = num / 10;           // remove last digit
        }

        System.out.println("Product = " + product);
    }
}

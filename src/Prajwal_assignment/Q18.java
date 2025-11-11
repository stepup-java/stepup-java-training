package Prajwal_Kalaskar_Assignment;

//18. Find product of digits in a number
//Input: 234
//Output: 24

public class Q18 {
    public static void main(String[] args) {


        int num = 234;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;   // get last digit
            product = product * digit;
            num = num / 10;         // remove last digit
        }

    }
}


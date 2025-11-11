//24. Count even and odd digits in a number
//Input: 123456
//Output: Even = 3, Odd = 3
package Prajwal_Kalaskar_Assignment;

public class Q24 {

        public static void main(String[] args) {
            int num = 123456;
            int even = 0, odd = 0;

            while (num > 0) {
                int digit = num % 10; // get last digit
                if (digit % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                num = num / 10; // remove last digit
            }

            System.out.println("Even = " + even + ", Odd = " + odd);
        }
    }



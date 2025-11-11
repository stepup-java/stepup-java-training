
//20. Find smallest digit in a number
//Input: 4721
//Output: 1

package Prajwal_Kalaskar_Assignment;

public class Q20 {

    public static void main(String[] args) {
            int num = 4721;
            int min = 9;   // start with highest possible digit

            while (num > 0) {
                int digit = num % 10;  // extract last digit
                if (digit < min) {
                    min = digit;      // update min
                }
                num = num / 10;        // remove last digit
            }

            System.out.println("Smallest digit: " + min);
        }
}
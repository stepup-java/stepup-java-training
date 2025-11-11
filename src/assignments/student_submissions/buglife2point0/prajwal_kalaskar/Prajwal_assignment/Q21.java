//21. Check if number is Armstrong
//Input: 153
//Output: Armstrong Number

package assignments.student_submissions.buglife2point0.prajwal_kalaskar.Prajwal_assignment;

public class Q21 {
    public static void main(String[] args) {

                int num = 153;
                int original = num;
                int sum = 0;
                int digits = String.valueOf(num).length();  // count digits

                while (num > 0) {
                    int digit = num % 10;
                    sum += Math.pow(digit, digits);  // digit^digits
                    num = num / 10;
                }

                if (sum == original) {
                    System.out.println("Armstrong Number");
                } else {
                    System.out.println("Not Armstrong Number");
                }
            }
        }


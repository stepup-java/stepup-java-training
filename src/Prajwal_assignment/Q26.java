//26. Use break to stop loop when number reaches 5
//Output: 1 2 3 4 (loop stops at 5)

package Prajwal_Kalaskar_Assignment;

public class Q26 {

        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i == 5) {
                    break;   // stop loop when i becomes 5
                }
                System.out.print(i + " ");
            }
        }
    }


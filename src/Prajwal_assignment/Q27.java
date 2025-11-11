//27. Use continue to skip printing number 5 from 1 to 10
//Output: 1 2 3 4 6 7 8 9 10

package Prajwal_Kalaskar_Assignment;

public class Q27 {


        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i == 5) {
                    continue;   // skip 5
                }
                System.out.print(i + " ");
            }
        }
    }




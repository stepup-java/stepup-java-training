//29. Print all prime numbers from 1 to 50
//Output: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

        package Prajwal_Kalaskar_Assignment;

public class Q29 {

        public static void main(String[] args) {
            for (int num = 2; num <= 50; num++) {
                boolean isPrime = true;

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }



}

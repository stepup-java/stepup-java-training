//30. Print Fibonacci series up to 10 terms
//Output: 0 1 1 2 3 5 8 13 21 34

        package Prajwal_Kalaskar_Assignment;

public class Q30 {

        public static void main(String[] args) {
            int n = 10;
            int a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }



}

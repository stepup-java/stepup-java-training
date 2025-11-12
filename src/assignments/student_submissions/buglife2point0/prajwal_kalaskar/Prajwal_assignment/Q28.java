//28. Print numbers 1 to 20, but stop if divisible by 9 using break
//Output: 1 2 3 4 5 6 7 8 (stops before 9)
package assignments.student_submissions.buglife2point0.prajwal_kalaskar.Prajwal_assignment;

public class Q28 {

        public static void main(String[] args) {
            for (int i = 1; i <= 20; i++) {
                if (i % 9 == 0) {
                    break;   // stop when number is divisible by 9
                }
                System.out.print(i + " ");
            }
        }


}



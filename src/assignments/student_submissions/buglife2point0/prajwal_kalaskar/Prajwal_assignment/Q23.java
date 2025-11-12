//23. Print numbers from 1 to 100 divisible by both 3 and 5
//Output: 15 30 45 60 75 90

package assignments.student_submissions.buglife2point0.prajwal_kalaskar.Prajwal_assignment;

public class Q23 {
    public static void main(String[] args) {

                for (int i = 1; i <= 100; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }



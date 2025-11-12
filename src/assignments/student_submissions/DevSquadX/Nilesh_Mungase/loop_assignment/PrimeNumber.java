/*29. Print all prime numbers from 1 to 50
Output: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
*/

package assignments.student_submissions.DevSquadX.Nilesh_Mungase.loop_assignment;

public class PrimeNumber {

    public static void main(String[] args) {
        for(int i=2; i<=50; i++) {
            int count = 0;
            for(int j=2; j<=i/2; j++) {
                if(i%j==0) { count=1; break; }
            }
            if(count==0)
                System.out.print(i + " ");
        }
    }
	}

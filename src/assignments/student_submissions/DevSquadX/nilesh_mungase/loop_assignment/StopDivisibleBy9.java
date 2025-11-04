/*28. Print numbers 1 to 20, but stop if divisible by 9 using break
Output: 1 2 3 4 5 6 7 8 (stops before 9)
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

public class StopDivisibleBy9 {

	public static void main(String[] args) {
		int n = 20;
		for (int i = 1; i < n; i++) {
			if (i % 9 == 0) {
				break;
			}
			System.out.println(i);
		}
	}

}

/*26. Use break to stop loop when number reaches 5
Output: 1 2 3 4 (loop stops at 5)
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

public class BreakLoop {

	public static void main(String[] args) {
		int n = 100;
		for (int i = 1; i < n; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}

}

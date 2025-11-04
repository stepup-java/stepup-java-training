/*27. Use continue to skip printing number 5 from 1 to 10
Output: 1 2 3 4 6 7 8 9 10
*/

package assignments.student_submissions.nilesh_mungase.com.nt.loop;

public class SkipTheItarationUsingContinue {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 1; i < num; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}

}

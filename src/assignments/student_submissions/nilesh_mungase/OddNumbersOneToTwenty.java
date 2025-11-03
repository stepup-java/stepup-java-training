/*4. Print odd numbers from 1 to 20
Output: 1 3 5 7 9 11 13 15 17 19
*/

package assignments.student_submissions.nilesh_mungase;

public class OddNumbersOneToTwenty {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}

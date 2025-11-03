/*12. Print numbers divisible by 3 from 1 to 50
Output: 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48
*/

package assignments.student_submissions.nilesh_mungase;

public class NumbersDivisibleBy3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}

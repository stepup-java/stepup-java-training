/*16. Reverse a number
Input: 1234
Output: 4321
*/

package assignments.student_submissions.nilesh_mungase;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;
		for (int temp = num; temp != 0; temp = temp / 10) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
		}
		System.out.println(rev);
	}

}

/*15. Sum of digits in a number
Input: 1234
Output: Sum = 10
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

public class SumOfDigit {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		for (int temp = num; temp != 0; temp = temp / 10) {
			int r = temp % 10;
			sum = sum + r;
		}
		System.out.println("Sum of Digit = "+sum);
	}

}

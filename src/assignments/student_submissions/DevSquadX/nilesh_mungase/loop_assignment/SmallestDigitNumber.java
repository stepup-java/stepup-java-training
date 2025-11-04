/*20. Find smallest digit in a number
Input: 4721
Output: 1
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

public class SmallestDigitNumber {

	public static void main(String[] args) {
		int num = 4721;
		int smallestNum = 9;
		for (int temp = num; temp != 0; temp = temp / 10) {
			int rem = temp % 10;
			if (rem < smallestNum) {
				smallestNum = rem;
			}
		}
		System.out.println("Smallest Digit = " + smallestNum);
	}

}

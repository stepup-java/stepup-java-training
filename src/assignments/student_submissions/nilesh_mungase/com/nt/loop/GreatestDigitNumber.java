/*19. Find greatest digit in a number
Input: 4721
Output: 7
*/

package assignments.student_submissions.nilesh_mungase.com.nt.loop;

public class GreatestDigitNumber {

	public static void main(String[] args) {
		int num = 4721;
		int greatestNum = 0;
		for (int temp = num; temp != 0; temp = temp / 10) {
			int rem = temp % 10;
			if (rem > greatestNum) {
				greatestNum = rem;
			}
		}
		System.out.println("Greatest Digit = " + greatestNum);
	}

}

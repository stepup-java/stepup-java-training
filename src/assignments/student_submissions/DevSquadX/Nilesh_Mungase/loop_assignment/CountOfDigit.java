/*14. Count digits in a number
Input: 12345
Output: Count = 5
*/

package assignments.student_submissions.DevSquadX.Nilesh_Mungase.loop_assignment;

public class CountOfDigit {

	public static void main(String[] args) {
		int count = 0;
		int num = 12345;
		for (int i = 0; num != 0; i++) {
			count++;
			num = num / 10;
			System.out.println(i);
		}
		System.out.println("Count of Digit is = " + count);
	}

}

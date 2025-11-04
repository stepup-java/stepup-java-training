/*21. Check if number is Armstrong
Input: 153
Output: Armstrong Number
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		for (int temp = num; temp != 0; temp = temp / 10) {
			int rem = temp % 10;
			sum += (rem * rem * rem);
		}
		String result = (sum == num) ? " Number is armstrong " : "Number is not armstrong";
		System.out.println(result + " : " + num);
	}
}

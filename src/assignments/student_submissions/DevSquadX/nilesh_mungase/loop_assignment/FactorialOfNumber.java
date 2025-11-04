/*13. Find factorial of a number
Input: 5
Output: 120
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int f = 1;
		for (int i = 1; i <= 5; i++) {
			f *= i;
		}
		System.out.println("Factorial Of Number : " + f);
	}

}

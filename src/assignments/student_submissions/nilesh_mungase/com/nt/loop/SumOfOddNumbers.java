/*9. Calculate sum of odd numbers from 1 to 50
Output: Sum = 625
*/

package assignments.student_submissions.nilesh_mungase.com.nt.loop;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("Sum of odd numbers upto 50 : " + sum);
	}

}

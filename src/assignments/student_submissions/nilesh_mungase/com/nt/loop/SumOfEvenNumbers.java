/*8. Calculate sum of even numbers from 1 to 50
Output: Sum = 650
*/

package assignments.student_submissions.nilesh_mungase.com.nt.loop;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 50; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of even numbers upto 50 : " + sum);
	}

}

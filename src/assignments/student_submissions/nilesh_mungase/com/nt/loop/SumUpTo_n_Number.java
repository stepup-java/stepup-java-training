/*25. Find sum of numbers from 1 to n
Input: n = 100
Output: Sum = 5050*/

package assignments.student_submissions.nilesh_mungase.com.nt.loop;

public class SumUpTo_n_Number {

	public static void main(String[] args) {
		int n = 100;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum Of Numbers = " + sum);
	}

}

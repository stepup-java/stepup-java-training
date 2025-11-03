/*24. Count even and odd digits in a number
Input: 123456
Output: Even = 3, Odd = 3
*/

package assignments.student_submissions.nilesh_mungase;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		int num = 1234567;
		int even = 0;
		int odd = 0;
		for (int temp = num; temp != 0; temp = temp / 10) {
			if (temp % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even = " + even + " Odd = " + odd);
	}

}

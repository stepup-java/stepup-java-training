/*18. Find product of digits in a number
Input: 234
Output: 24
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

public class ProductOfDigit {

	public static void main(String[] args) {
		int num = 234;
		int product = 1;
		for(int temp = num; temp != 0; temp = temp / 10)
		{
			int rem = temp % 10;
			product = rem * product;
		}
		System.out.println("Product of Digit : "+product);
	}

}

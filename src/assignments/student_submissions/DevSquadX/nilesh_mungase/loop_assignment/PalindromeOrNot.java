/*17. Check if a number is palindrome
Input: 121
Output: Palindrome
Input: 123
Output: Not Palindrome
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int num = 121;
		int rem = 0;
		int sum = 0;
		for (int temp = num; temp != 0; temp = temp / 10) {
			rem = temp % 10;
			sum = sum * 10 + rem;
		}
//		if(sum == num )
//		{
//			System.out.println("Number Is Palindrome : "+ num);
//		}
//		else
//		{
//			System.out.println("Number Is Not Palindrome : "+ num);
//		}

//		Ternary Operator => (condition) ? value_if_true : value_if_false

		String result = (sum == num) ? "Number is palindrome" : "Number is not a palindrome";
		System.out.println(result + " : " + num);
	}

}

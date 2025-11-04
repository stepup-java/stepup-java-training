/*6. Print table of any number (input by user)
Input: 7
Output: 7 14 21 28 35 42 49 56 63 70
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

import java.util.Scanner;

public class TableOfAnyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println("You Entered Number : " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		sc.close();
	}

}

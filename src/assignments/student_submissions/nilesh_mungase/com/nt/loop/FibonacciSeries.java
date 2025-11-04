/*30. Print Fibonacci series up to 10 terms
Output: 0 1 1 2 3 5 8 13 21 34
*/

package assignments.student_submissions.nilesh_mungase.com.nt.loop;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		int a = 0;
		int b = 1;
		for (int i = 0; i < n; i++) {
			System.out.println(a + " ");
			b = a + b;
			a = b - a;
		}
	}
}

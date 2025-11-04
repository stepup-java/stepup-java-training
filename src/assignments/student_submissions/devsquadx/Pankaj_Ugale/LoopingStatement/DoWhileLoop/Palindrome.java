package assignments.student_submissions.devsquadx.Pankaj_Ugale.LoopingStatement.DoWhileLoop;

public class Palindrome {

	public static void main(String[] args) {
		int i = 0;
		int n = 121;
		int r = 0;
		int rev = 0;
		int t = n;
		for (i = 0; n != 0; i++) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if (t == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}

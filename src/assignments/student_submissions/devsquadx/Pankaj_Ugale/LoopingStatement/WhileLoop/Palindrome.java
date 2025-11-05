package assignments.student_submissions.devsquadx.Pankaj_Ugale.LoopingStatement.WhileLoop;

public class Palindrome {

	public static void main(String[] args) {
		int i = 0;
		int n = 121;
		int r = 0;
		int rev = 0;
		int t = n;
		while (n != 0) {
            i++;
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if (t == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome.");
		}
	}
}

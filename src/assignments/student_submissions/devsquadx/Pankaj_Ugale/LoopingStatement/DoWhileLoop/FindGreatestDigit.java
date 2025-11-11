package assignments.student_submissions.devsquadx.Pankaj_Ugale.LoopingStatement.DoWhileLoop;

public class FindGreatestDigit {
	public static void main(String[] args) {
		int i = 0;
		int n = 4721;
		int r = 0;
		int max = 0;
		for (i = 0; n != 0; i++) {

			r = n % 10;
			n = n / 10;
			if (r > max) {
				max = r;
			}
		}
		System.out.println(max);
	}
}

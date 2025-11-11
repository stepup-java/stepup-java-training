package assignments.student_submissions.devsquadx.Pankaj_Ugale.LoopingStatement.ForLoop;

public class ProductOfDigit {

	public static void main(String[] args) {
		int i = 0;
		int n = 234;
		int r = 0;
		int product = 1;
		for (; n != 0; i++) {
			r = n % 10;
			n = n / 10;
			product = product * r;

		}
		System.out.println(product);
	}
}

package assignments.student_submissions.Pankaj_Ugale.LoopingStatement.DoWhileLoop;

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

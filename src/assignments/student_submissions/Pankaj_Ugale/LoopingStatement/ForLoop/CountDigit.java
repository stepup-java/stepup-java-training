package assignments.student_submissions.Pankaj_Ugale.LoopingStatement.ForLoop;

public class CountDigit {

	public static void main(String[] args) {
		int i = 0;
		int n = 12345;
		int count = 0;
		for (i = 0; n != 0; i++) {
			n = n / 10;
			count++;

		}
		System.out.println(count);
	}
}

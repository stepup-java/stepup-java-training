package assignments.student_submissions.DevSquadX.Pankaj_Ugale.LoopsAssignment.DoWhileLoop;

public class CountEvenAndOdd {

	public static void main(String[] args) {

		int i = 0;
		int n = 2556777;
		int r = 0;
		int even = 0;
		int odd = 0;
		for (i = 0; n != 0; i++) {
			r = n % 10;
			n = n / 10;
			if (r % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even = "+even +", Odd ="+odd);
	}
}

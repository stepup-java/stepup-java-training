package assignments.student_submissions.DevSquadX.Pankaj_Ugale.LoopsAssignment.ForLoop;

public class SumOfDigit {

	public static void main(String[] args) {
		int i = 0;
		int n = 1234;
		int r =0;
		int sum = 0;
		for (; n!= 0; i++) {
			r = n%10;
			n = n/10;
			sum = sum+r;

		}
		System.out.println(sum);
	}
}

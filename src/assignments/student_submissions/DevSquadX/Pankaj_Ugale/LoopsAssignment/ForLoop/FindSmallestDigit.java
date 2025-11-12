package assignments.student_submissions.DevSquadX.Pankaj_Ugale.LoopsAssignment.ForLoop;

public class FindSmallestDigit {
	public static void main(String[] args) {
		int i = 0;
		int n = 4721;
		int r = 0;
		int min = 9;
		for (i = 0; n != 0; i++) {

			r = n % 10;
			n = n / 10;
			if (r < min) {
				min = r;
			}
		}
		System.out.println(min);
	}
}

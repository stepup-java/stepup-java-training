package assignments.student_submissions.DevSquadX.Pankaj_Ugale.LoopsAssignment.WhileLoop;

public class BreakFromNumReaches5 {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
             i++;
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
	}
}

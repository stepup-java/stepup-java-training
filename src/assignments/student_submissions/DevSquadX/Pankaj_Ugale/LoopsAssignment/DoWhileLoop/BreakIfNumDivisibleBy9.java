package assignments.student_submissions.DevSquadX.Pankaj_Ugale.LoopsAssignment.DoWhileLoop;

public class BreakIfNumDivisibleBy9 {

	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++)
		{
			if(i%9==0) {
				break;
			}
			System.out.println(i);
		}
	}
}

package assignments.student_submissions.devsquadx.Pankaj_Ugale.LoopingStatement.ForLoop;

public class ContinueToSkip5From1To10 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
}

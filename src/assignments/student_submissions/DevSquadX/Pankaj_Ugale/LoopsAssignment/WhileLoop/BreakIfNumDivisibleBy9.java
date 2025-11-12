package assignments.student_submissions.DevSquadX.Pankaj_Ugale.LoopsAssignment.WhileLoop;

public class BreakIfNumDivisibleBy9 {

	public static void main(String[] args) {
		int i =0;
		while(i<=20)
		{ 
			i++;
			if(i%9==0) {
				break;
			}
			System.out.println(i);
		}
	}
}

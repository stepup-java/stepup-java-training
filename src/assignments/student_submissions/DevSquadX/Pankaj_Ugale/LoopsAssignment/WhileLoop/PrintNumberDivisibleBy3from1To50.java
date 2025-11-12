package assignments.student_submissions.DevSquadX.Pankaj_Ugale.LoopsAssignment.WhileLoop;

public class PrintNumberDivisibleBy3from1To50 {
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++)
		{
			if(i%3==0){
				System.out.println(i);
			}
		}
	}
}
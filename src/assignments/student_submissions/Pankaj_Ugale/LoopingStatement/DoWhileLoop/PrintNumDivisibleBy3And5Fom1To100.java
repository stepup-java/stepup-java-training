package assignments.student_submissions.Pankaj_Ugale.LoopingStatement.DoWhileLoop;

public class PrintNumDivisibleBy3And5Fom1To100 {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++)
		{
			if(i%3==0 && i%5==0){
				System.out.println(i);
			}
		}
	}
}
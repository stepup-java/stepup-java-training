package assignments.student_submissions.Pankaj_Ugale.LoopingStatement.DoWhileLoop;

public class PrimeNumberFrom1To50 {

	public static void main(String[] args) {

		for (int i = 2; i <= 50; i++) { 
			int count = 0;

			for (int j = 1; j <= i; j++) {  
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {  
				System.out.println(i);
			}
		}
	}
}

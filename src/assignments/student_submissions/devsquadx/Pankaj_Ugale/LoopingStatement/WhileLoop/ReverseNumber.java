package assignments.student_submissions.devsquadx.Pankaj_Ugale.LoopingStatement.WhileLoop;

public class ReverseNumber {

	public static void main(String[] args) {
		int i = 0;
		int n = 1234;
		int r =0;
		int rev = 0;
		for (i=0; n!= 0; i++) {
			r = n%10;
			rev = rev *10 + r;
			n= n/10;
		}
		System.out.println(rev);
	}
}

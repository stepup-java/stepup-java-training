package assignments.student_submissions.Pankaj_Ugale.LoopingStatement.DoWhileLoop;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int i = 0;
		int n = 153;
		int r = 0;
		int arm = 0;
		int t = n;
		for (i = 0; n != 0; i++) {
			r = n % 10;
			arm = arm+r*r*r;
			n = n / 10;
			
		}
		
		if (t == arm) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}

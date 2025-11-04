package assignments.student_submissions.Pankaj_Ugale.LoopingStatement.WhileLoop;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int r = 0;
		int arm = 0;
		int t = n;
		while(n!=0) {
			r = n % 10;
			arm = arm+r*r*r;
			n = n / 10;
			System.out.println(r);
		}
		
		if (t == arm) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}

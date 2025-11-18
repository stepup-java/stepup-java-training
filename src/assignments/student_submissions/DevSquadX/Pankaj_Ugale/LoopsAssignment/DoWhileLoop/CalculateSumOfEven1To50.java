package assignments.student_submissions.DevSquadX.Pankaj_Ugale.LoopsAssignment.DoWhileLoop;

public class CalculateSumOfEven1To50 {
public static void main(String[] args) {
	int i=0;
	int sum=0;
	for(i=1;i<=50;i++) {
		if(i%2==0) {
			sum = sum +i;
		}
	}
	System.out.println(sum);
}
}

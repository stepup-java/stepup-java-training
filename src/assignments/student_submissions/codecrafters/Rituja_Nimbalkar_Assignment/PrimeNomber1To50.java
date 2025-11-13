package assignments.student_submissions.codecrafters.Rituja_Nimbalkar_Assignment;

public class PrimeNomber1To50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
int fn=0,sn=1;
//System.out.println(n);

for(int i=1;i<=n;i++) {
	System.out.println(fn);

	
	int nn=fn+sn;
	fn=sn;
	sn=nn;
}
	}

}

package assignments.student_submissions.codecrafters.Rituja_Nimbalkar_Assignment;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234;
int sum=0;
while(num!=0) {
	int digit=num%10;
	sum=sum+digit;
	num=num/10;
}
System.out.println(sum);
	}

}

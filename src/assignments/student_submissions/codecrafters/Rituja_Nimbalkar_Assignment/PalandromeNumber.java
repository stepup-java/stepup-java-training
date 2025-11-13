package assignments.student_submissions.codecrafters.Rituja_Nimbalkar_Assignment;

public class PalandromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123;
int reverse=0;
int temp=num;
while(temp !=0) {
	int digit = temp %10;
	reverse = (reverse * 10)+digit;
	temp = temp/10;
}
if(reverse==num) {
System.out.println(reverse);
	}
	}
}

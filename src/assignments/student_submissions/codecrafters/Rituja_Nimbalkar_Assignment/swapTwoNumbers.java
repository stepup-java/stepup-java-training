package assignments.student_submissions.codecrafters.Rituja_Nimbalkar_Assignment;

public class swapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=90;
		int b=59;
		
		//1st way
		a=a^b;
		System.out.println(b=a^b);
		System.out.println(a=a^b);
		
		//2nd way
		a=a+b;
		System.out.println(b=a-b);
		System.out.println(a=a-b);
		
		//3rd way
		int temp;
		temp=a;
		System.out.println(a=b);
		System.out.println(b=temp);
}
	}
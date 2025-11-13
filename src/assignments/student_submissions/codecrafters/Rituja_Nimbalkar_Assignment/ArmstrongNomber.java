package assignments.student_submissions.codecrafters.Rituja_Nimbalkar_Assignment;

public class ArmstrongNomber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		amstrongNumber();
//		TestMe.test();
		ArmstrongNomber am = new ArmstrongNomber();
		am.amstrongNumber(153);
		System.out.println(am.test());
	}
	
	static void amstrongNumber() {
		int num=1530;
		int originalnum=num;
		int checknum = num;
		int sum=0;
		while(originalnum>0) {
//			int digit = num%10;
			sum++;
			originalnum/=10;
		}
		int newsum=0;
		while(num>0) {
			int digit = num%10;
			newsum=newsum+(int)(Math.pow(digit,sum));
			num/=10;
		}
		if(checknum == newsum) {
		System.out.println(checknum + " is an armstrong");
		}
		else {
		System.out.println(checknum + " is not an a armstrong");
		}
	}

	 void amstrongNumber(int num) {
//		int num=1530;
		int originalnum=num;
		int checknum = num;
		int sum=0;
		while(originalnum>0) {
//			int digit = num%10;
			sum++;
			originalnum/=10;
		}
		int newsum=0;
		while(num>0) {
			int digit = num%10;
			newsum=newsum+(int)(Math.pow(digit,sum));
			num/=10;
		}
		if(checknum == newsum) {
		System.out.println(checknum + " is an armstrong");
		}
		else {
		System.out.println(checknum + " is not an a armstrong");
		}
	}

	String test(String name) {
		return name;
	}

	String test() {
		return "hello";
	}


}

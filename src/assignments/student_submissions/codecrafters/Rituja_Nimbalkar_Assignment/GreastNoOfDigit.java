package assignments.student_submissions.codecrafters.Rituja_Nimbalkar_Assignment;

public class GreastNoOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=47218;//initiliaze value of num is 4721
int greatest=0;//initiliaze greatest with 0
while(num>0) { //condition iss here that num is greater than 0
	int digit =num%10; //extract last digit
	if(digit>greatest) { //digit > greatest
		greatest=digit;  //value of digit  is put on greatest
	}
	num=num/10;         //num i by 10 because of remove last digit
}
System.out.println("greatest digit og 4721 is" + greatest);

	}

}

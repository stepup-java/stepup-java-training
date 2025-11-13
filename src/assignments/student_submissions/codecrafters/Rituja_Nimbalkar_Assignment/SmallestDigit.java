package assignments.student_submissions.codecrafters.Rituja_Nimbalkar_Assignment;

public class SmallestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=87634;  //num integer is initiliaze
int smallest=9; //smallest digit concidered as 9  
while(num>0) {  //check condition while number 87634 is greater than 0
	int digit=num%10; //for extract last digit 
	if(digit<smallest) {  //if digit is smaller than smallest value 
	smallest=digit;       //then we put the value of smallest in digit
}
num=num/10;               //num value = num value / 10 
}
System.out.println("smallest digit in" + smallest);
	}

}

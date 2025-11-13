package assignments.student_submissions.codecrafters.Rituja_Nimbalkar_Assignment;

public class ProductOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int product=1;//initiliaze the product
int digit;    //declare digit variable
int num = 234;    //initiliaze num
while (num>0) {  //here we put condition if num is greater than 234 num is already 0 so 0<234
	               // first loop is completed value found 23(0<23)
	               // last is happened value of num is 0 so condition are not satisfied 0<0
	               //so loop will be stop exacution
	
	digit =num%10;  //then here nums remender is 4
	                //again we find value of digit is 3 because 3 is remender
	                //and again remainder is remaining 2
	               
	
	product=product*digit;   //our product value is 1  and digit value is so here 1*4=4
	                         //then  we found product value is 4, digits value is 3 so here 4*3=12
	                         //then product value is product value is 12,digit value is 2 here 12*2=24
	
	num=num/10;              //for removing last digit we divided no by 10 and value is remaining 23
	                         //this operation again gives value of num is 23 because of we divided by 10 last digit will be removed
	                         //and again value of num is 2 last digit was removed by dividing by 10 
	                         //here is value of num is 0 
}
System.out.println("product of digit" + product);
	}

}

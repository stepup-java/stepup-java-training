package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;

public class productDigitNumber {
    static void main() {
        int num=234;
        int product=1;
        while(num!=0){
            int digit=num%10;
            product=product*digit;
            num=num/10;
        }
        System.out.println("prroduct="+product);
    }
}

package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;

public class sumDigitnumber {
    static void main() {
        int num=1234;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum +digit;
            num=num/10;
        }
        System.out.println("sum="+sum);
    }
}

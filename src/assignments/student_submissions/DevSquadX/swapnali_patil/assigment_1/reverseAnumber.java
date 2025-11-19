package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;

public class reverseAnumber {
    static void main() {
        int num=1234;
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10 ;       }
        System.out.println("Reversed number"+rev);
    }
}

package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;

public class countDigits {
    static void main() {
        int num=12345;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("count ="+count);
    }
}

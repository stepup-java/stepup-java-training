package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;

public class odd_numberSum {
    static void main() {
        int sum=0;
        for(int i=1;i<=50;i++){
            if(i%2 !=0){
                sum=sum+i;
            }
        }
        System.out.println("sum="+sum);

    }
}

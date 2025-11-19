package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;

public class Divisibleby3And5 {
    static void main() {
        System.out.println("Numbers both divisible by 3 and 5 are:");
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%5==0){
                System.out.println(i);
            }
        }
    }
}

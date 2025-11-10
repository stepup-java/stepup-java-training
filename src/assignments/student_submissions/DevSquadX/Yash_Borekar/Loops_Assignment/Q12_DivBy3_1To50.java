package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 12: Print numbers divisible by 3 from 1 to 50
public class Q12_DivBy3_1To50 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i ++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
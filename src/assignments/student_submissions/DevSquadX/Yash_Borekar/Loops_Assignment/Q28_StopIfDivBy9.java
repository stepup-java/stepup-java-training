package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 28: Print numbers 1 to 20, but stop if divisible by 9 using break
public class Q28_StopIfDivBy9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 9 == 0) 
             break;
            System.out.println(i);
            
        }
        
    }
}
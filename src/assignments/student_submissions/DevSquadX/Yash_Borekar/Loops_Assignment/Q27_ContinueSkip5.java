package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 27: Use continue to skip printing number 5 from 1 to 10
public class Q27_ContinueSkip5 {
    public static void main(String[] args) {
  
        for (int i = 1; i <= 10; i++) {
            if (i == 5) 
             continue;
            System.out.println(i);
        }
  
    }
}
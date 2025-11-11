package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 23: Print numbers from 1 to 100 divisible by both 3 and 5
public class Q23_DivBy3And5_1To100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i ++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println(i);
            }
        }
    }
}
package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 9: Calculate sum of odd numbers from 1 to 50
public class Q9_SumOdd1To50 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 49; i += 2) 
         sum += i;
        System.out.println("Sum = " + sum);
    }
}
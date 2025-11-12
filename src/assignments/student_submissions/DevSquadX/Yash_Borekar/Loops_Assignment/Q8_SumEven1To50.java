package assignments.student_submissions.DevSquadX.Yash_Borekar.Loops_Assignment;
// Question 8: Calculate sum of even numbers from 1 to 50
public class Q8_SumEven1To50 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 50; i += 2)
         sum += i;
        System.out.println("Sum = " + sum);
    }
}
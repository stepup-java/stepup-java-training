package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 9: Calculate sum of odd numbers from 1 to 50 using a for loop
class Q9_SumOfOdd1To50 {
    public static void main(String[] args) {
        int sum = 0;
        // Start at 1 and increment by 2
        for (int i = 1; i <= 50; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to 50 using a for loop: Sum = " + sum);
    }
}
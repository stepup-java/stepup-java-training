package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 8: Calculate sum of even numbers from 1 to 50 using a for loop
class Q8_SumOfEven1To50 {
    public static void main(String[] args) {
        int sum = 0;
        // Start at 2 and increment by 2
        for (int i = 2; i <= 50; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to 50 using a for loop: Sum = " + sum);
    }
}
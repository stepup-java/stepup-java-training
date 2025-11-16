package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 7: Calculate sum of first 10 natural numbers using a for loop
class Q7_SumOf10Naturals {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers using a for loop: Sum = " + sum);
    }
}
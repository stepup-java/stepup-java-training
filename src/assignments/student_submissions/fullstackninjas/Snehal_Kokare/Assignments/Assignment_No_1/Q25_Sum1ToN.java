package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;
// Question 25: Find sum of numbers from 1 to n (Input: n = 100) using a for loop
class Q25_Sum1ToN {
    public static void main(String[] args) {
        int n = 100;
        long sum = 0; // Use long for sum

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Input: n = " + n);
        System.out.println("sum of numbers from 1 to n (Input: n = 100) using a for loop:\nSum = " + sum);
    }
}
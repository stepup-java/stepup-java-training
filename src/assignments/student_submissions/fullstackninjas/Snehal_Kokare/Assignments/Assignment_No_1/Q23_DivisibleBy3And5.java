package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 23: Print numbers from 1 to 100 divisible by both 3 and 5 using a for loop
class Q23_DivisibleBy3And5 {
    public static void main(String[] args) {
        System.out.print("numbers from 1 to 100 divisible by both 3 and 5 using a for loop:\n ");
        for (int i = 1; i <= 100; i++) {
            // Check if divisible by both 3 and 5 (or divisible by 15)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
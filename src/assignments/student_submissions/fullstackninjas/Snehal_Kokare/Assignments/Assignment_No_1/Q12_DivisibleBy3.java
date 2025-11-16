package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 12: Print numbers divisible by 3 from 1 to 50 using a for loop
class Q12_DivisibleBy3 {
    public static void main(String[] args) {
        System.out.print("numbers divisible by 3 from 1 to 50 using a for loop:\n ");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 4: Print odd numbers from 1 to 20 using a for loop

class Q4_Odd1To20 {
    public static void main(String[] args) {
        System.out.print("Odd numbers from 1 to 20 using a for loop:\n ");
        // Start at 1 and increment by 2
        for (int numbers = 1; numbers <= 20; numbers += 2) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }
}
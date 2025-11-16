package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 3: Print even numbers from 1 to 20 using a for loop

class Q3_Even1To20 {
    public static void main(String[] args) {
        System.out.print("Even numbers from 1 to 20 using a for loop\n ");
        // Start at 2 and increment by 2
        for (int numbers = 2; numbers <= 20; numbers += 2) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }
}
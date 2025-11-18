package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;

// Question 2: Print numbers from 10 to 1 using a do-while loop

public class Q2_Print10To1 {
    public static void main(String[] args) {
        int numbers = 10;
        System.out.print("Numbers from 10 to 1 are : ");
        do {
            System.out.print(numbers + " ");
            numbers--;
        } while (numbers >= 1);
        System.out.println();
    }
}

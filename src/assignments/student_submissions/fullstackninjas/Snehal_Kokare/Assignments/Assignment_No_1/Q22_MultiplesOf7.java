package assignments.student_submissions.fullstackninjas.Snehal_Kokare.Assignments.Assignment_No_1;
// Question 22: Print first 10 multiples of 7 using a for loop
class Q22_MultiplesOf7 {
    public static void main(String[] args) {
        int number = 7;
        System.out.print("first 10 multiples of 7 using a for loop:\n ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((number * i) + " ");
        }
        System.out.println();
    }
}
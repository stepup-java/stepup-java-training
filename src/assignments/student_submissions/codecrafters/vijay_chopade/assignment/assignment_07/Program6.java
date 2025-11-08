package assignments.student_submissions.codecrafters.vijay_chopade.assignment.assignment_07;

import java.util.Scanner;
// Q6: Print table of any number entered by user
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.print(n*i + " ");
        }
    }
}



package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

import java.util.Scanner;

// Q6: Print table of any number entered by user
public class InputByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.print(n*i + " ");
        }
    }
}



package assignments.student_submissions.core8.Tejashree_Suryawanshi.Assignments;

import java.util.Scanner;

//         Assignment NO 06: Print table of any number (input by user)

public class User_Input_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
        sc.close();

    }
}

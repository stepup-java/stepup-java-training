package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

import java.util.Scanner;

// Q21: Check if number is Armstrong
public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), temp = n, sum = 0;
        while(n > 0) {
            int d = n % 10;
            sum += d*d*d;
            n /= 10;
        }
        if(sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}

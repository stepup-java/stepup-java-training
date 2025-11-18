package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q21: Check if number is Armstrong
import java.util.Scanner;

class Armstrong {
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

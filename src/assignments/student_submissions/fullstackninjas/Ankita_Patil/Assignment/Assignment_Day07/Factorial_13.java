//13. Find factorial of a number
package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

import java.util.Scanner;

public class Factorial_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        int num=sc.nextInt();
        int fact=1;
        while(num>0){
            fact=fact*num;
            num--;
        }
        System.out.println("output:"+fact);
    }
}

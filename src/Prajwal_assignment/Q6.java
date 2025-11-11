package Prajwal_Kalaskar_Assignment;

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
         // 6. Print table of any number (input by user)

Scanner sc =new Scanner(System.in);
		 System.out.print(" Enter number for table: ");
		    int num = sc.nextInt();
		    for (int i = 1; i <= 10; i++) {
		     	System.out.print(num * i + " ");
		    }
    }
}

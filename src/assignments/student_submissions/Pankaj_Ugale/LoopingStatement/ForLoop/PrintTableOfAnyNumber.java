package assignments.student_submissions.Pankaj_Ugale.LoopingStatement.ForLoop;

import java.util.Scanner;

public class PrintTableOfAnyNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(n*i);
		}
	}

}

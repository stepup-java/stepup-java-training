//6. Print table of any number (input by user)
package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

import java.util.Scanner;

public class Table_Any_Num_6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number to create the table:");
        System.out.print("Input:");
        num=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.print(num*i +" ");
        }

    }
}


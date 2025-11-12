//14. Count digits in a number
package assignments.student_submissions.fullstackninjas.Ankita_Patil.Assignment.Assignment_Day07;

import java.util.Scanner;

public class Count_digits_14 {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:");
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            num/=10;
            count++;

        }
        System.out.println("Count:"+count);
    }
}

package assignments.student_submissions;

import java.util.Scanner;

public class SumOfNNumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int sum=0;
//        for (int i=1;i<=n;i++){
//            sum+=i;
//        }
//        int i=1;
//        while(i<=n){
//            sum+=i;
//            i++;
//        }

        int i=1;
        do{

            sum+=i;
            i++;
        }
        while(i<=n);
        System.out.println("Sum Of N numbers: "+sum);
    }
}

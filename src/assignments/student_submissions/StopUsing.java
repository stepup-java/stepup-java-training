package assignments.student_submissions;

import java.util.Scanner;

public class StopUsing {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
//        for(int i=1;i<n;i++){
//            if(i%9==0){
//                break;
//            }
//            System.out.println(i);
//        }
        int i=1;
//        while (i<n){
//            if(i%9==0){
//                i++;
//                continue;
//            }
//
//            System.out.println(i);
//            i++;
//        }
        do{
            if(i%9==0){
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }while (i<n);


    }
}

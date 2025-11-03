package assignments.student_submissions;

import java.util.Scanner;

public class Continueuse {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
//        for(int i=1;i<n;i++){
//            if(i==5){
//                continue;
//            }
//            System.out.println(i);
//        }
        int i=1;
//        while (i<n){
//            if(i==5){
//                i++;
//                continue;
//            }
//
//            System.out.println(i);
//            i++;
//        }
        do{
            if(i==5){
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }while (i<n);


    }
}

package assignments.student_submissions.demo_student;

import java.util.Scanner;

public class StopLoop {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
//        for (int i=1;i<num;i++){
//            System.out.println(i);
//            if(i==5){
//
//                break;
//            }
//        }
//        int i=1;
//        while (i<num){
//            System.out.println(i);
//            if(i==5){
//
//                break;
//            }
//            i++;
//        }
        int i=1;
        do{
            System.out.println(i);
            if(i==5){

                break;
            }
            i++;
        }while (i<num);
    }
}
